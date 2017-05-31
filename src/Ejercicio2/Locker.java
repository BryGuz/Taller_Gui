/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bryan M
 */
public class Locker {
     public static void main(String[] args){
        System.out.println("Clave inicial 1234");
        Pantalla p = new Pantalla();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     }
}
     
     class Pantalla extends JFrame{
    public Pantalla(){
        
        setTitle("Candado");
    
        setResizable(false);
        setSize(230,130);
        setLocationRelativeTo(null);
        candado candado = new candado();
        add(candado);
    }
} 
 class candado extends JPanel implements ActionListener{
     
     // PANEL Y BOTONES 
     
    JPanel Panel1 = new JPanel();
    JPanel Panel2 = new JPanel();
    
    JTextField field = new JTextField("1234",20);
    JButton botonVOC = new JButton("  OPEN / CLOSE ");
    JButton boton = new JButton("Change Combination");
    
    JButton botonROC = new JButton("  OPEN / CLOSE ");
    JTextField field2 = new JTextField("1234",20);
    JButton boton2 = new JButton("Change Combination");
    
    public candado(){
         super(new BorderLayout());
         //PANEL 1 ABIERTO
        
        field.setPreferredSize(new Dimension(0,30));
        field.addActionListener(this);                // ESCUCHA FIELD VERDE
        
        botonVOC.setBorderPainted(false);
        botonVOC.setOpaque(true);
        botonVOC.setBackground(Color.green);
        botonVOC.setPreferredSize(new Dimension(350,30));
        botonVOC.addActionListener(this);             // ESCUCHA BOTON VERDE CLOSE / OPEN
        
        boton.setPreferredSize(new Dimension(300,30));
        boton.addActionListener(this);                // ESCUCHA BOTON CAMBIAR PW VERDE
       
        Panel1.setBackground(Color.GREEN);
        Panel1.add(botonVOC);
        Panel1.add(field);
        Panel1.add(boton);
        
        //PANEL 2 CERRADO
        
        botonROC.setBorderPainted(false);
        botonROC.setOpaque(true);
        botonROC.setBackground(Color.red);
        botonROC.setPreferredSize(new Dimension(350,30)); 
        botonROC.addActionListener(this);             // ESCUCHA BOTON ROJO CLOSE /OPEN
        
        field2.setPreferredSize(new Dimension(0,30));
        field2.addActionListener(this);               // ESCUCHA FIELD CANSI ROJO
        
        boton2.setPreferredSize(new Dimension(350,30));
        boton2.addActionListener(this);               // ESCUCHA BOTON CAMBIAR CONTRA
       
        Panel2.setBackground(Color.RED);
        Panel2.add(botonROC);
        Panel2.add(field2);
        Panel2.add(boton2); 
        
        add(Panel2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonP =e.getSource();
        // CAMBIA PANEL SI ESTA EN ROJO AL CLIKEAR BOTON Y CONTRASEÑA ES CORRECTA
        if(botonP == botonROC){
            if (field2.getText().equals(field.getText())) {
             
             
                remove(Panel2);
                add(Panel1);

            } 
        repaint();
        revalidate();  
        } 
        // NO PERMITE CAMBIAR LA CONTRASEÑA SI ESTA CERRADO
        if(botonP == boton2){
            field2.setText("Candado debe estar abierto");
        }
        // CAMBIA CONTRASEÑA CUANDO ESTA ABIERTO
        if(botonP == boton){
            field.setText("Introduzca nueva contraseña");
            field2.setText(field.getText());
            
        }
        // CIERRA EL CANDADO SI ESTA ABIERTO
        
        if(botonP == botonVOC){
            remove(Panel1);
            add(Panel2);
        }
        repaint();
        revalidate();  
        
    }
 }
 
