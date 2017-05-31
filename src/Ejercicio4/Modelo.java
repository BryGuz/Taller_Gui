/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Bryan M
 */
public class Modelo {
    private String InteresA;
    private String Naños;
    private String Prestamo;

    public Modelo() {
        
        InteresA = "";
        Naños = "";
        Prestamo = "";
        
    }

    public String getInteresA() {
        return InteresA;
    }

    public void setInteresA(String InteresA) {
        this.InteresA = InteresA;
    }

    public String getNaños() {
        return Naños;
    }

    public void setNaños(String Naños) {
        this.Naños = Naños;
    }

    public String getPrestamo() {
        return Prestamo;
    }

    public void setPrestamo(String Prestamo) {
        this.Prestamo = Prestamo;
    }
    
    
}
