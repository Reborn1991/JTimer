/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwork.counter;

import java.io.Serializable;

/**
 *
 * @author Honza
 */
public class Mounth implements Serializable{
    final int Kolikátý;
    private double odpracovanyCas;
    private final double pozadovanyCas;

    public Mounth(int Kolikátý, double pozadovanyCas) {
        this.Kolikátý = Kolikátý;
        this.pozadovanyCas = pozadovanyCas;
    }

    double prescas(){
    return pozadovanyCas-odpracovanyCas;}
public String toString(){
Integer p=Kolikátý;
return p.toString();
}
    public double getOdpracovanyCas() {
        return odpracovanyCas;
    }
    
    
    
    
    
}
