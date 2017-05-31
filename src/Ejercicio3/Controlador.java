/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Bryan M
 */
public class Controlador implements ActionListener{
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       this.modelo.setName(this.vista.getNamef().getText());
       this.modelo.setLast(this.vista.getLastf().getText());
       this.vista.MensajeText(vista.getNamef(),vista.getLastf());
        
    }
    
    public void StartAplication(){
        this.vista.setVisible(true);
    }
}