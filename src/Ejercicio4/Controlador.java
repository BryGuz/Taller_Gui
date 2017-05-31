/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Bryan M
 */
public class Controlador implements ActionListener{
    
    private Modelo modelo;
    private Vista vista;
    
    Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }

    void StartAplication() {
       this.vista.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object BotonX = e.getSource();
       this.modelo.setInteresA(this.vista.getTxtInteres().getText());
       this.modelo.setNaños(this.vista.getTxtAños().getText());
       this.modelo.setPrestamo(this.vista.getTxtLoan().getText());
       if (BotonX == vista.getBoton()){
       this.vista.Operaciones(vista.getTxtInteres(),vista.getTxtAños() , vista.getTxtLoan());
       }
    }
    
}
