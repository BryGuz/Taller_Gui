/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bryan M
 */
public class Vista extends JFrame{
     
     private JLabel name;
     private  JTextField namef; 
     private JLabel last ;
     private JTextField lastf;
     private  JButton boton;
     private JLabel hola ;
     private JPanel panel;
     private Controlador c;
  //   private Controlador c;
     public Vista(){
         
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setSize(230,330);
          setTitle("TextFieldTest");
          setResizable(false);
          
          setLocationRelativeTo(null);
          
         setLayout(new BorderLayout());
         
         this.name = new JLabel("Enter your first name");
         this.namef = new JTextField(19);
         this.last = new JLabel("Enter your Last name");
         this.lastf = new JTextField(19);
         this.boton = new JButton(" Done ");
         this.hola = new JLabel("");
         this.panel = new JPanel();
         
         setLayout(new BorderLayout());
         panel.add(name);
         panel.add(namef);
         panel.add(last);
         panel.add(lastf);
         panel.add(boton);
         panel.add(hola);
          
         add(panel);
        
        
     }
     public void setControlador(Controlador c){
         this.c =c;
         this.boton.addActionListener(this.c);
         this.namef.addActionListener(this.c);
         this.lastf.addActionListener(this.c);
     }
     public void MensajeText(JTextField n,JTextField l){
         hola.setText("          Hellow, " + n.getText() +" "+ l.getText()+ "        ");
     }

    public JTextField getNamef() {
        return namef;
    }

    public void setNamef(JTextField namef) {
        this.namef = namef;
    }

    public JTextField getLastf() {
        return lastf;
    }

    public void setLastf(JTextField lastf) {
        this.lastf = lastf;
    }
    
    

    

    
     
}



