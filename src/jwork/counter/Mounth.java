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
    private long odpracovanyCas;
    private final double pozadovanyCas;

    public Mounth(int Kolikátý, double pozadovanyCas) {
        this.Kolikátý = Kolikátý;
        this.pozadovanyCas = pozadovanyCas;
    }
//    public Mounth(){
//    Kolikátý=0;
//    odpracovanyCas=0;
//    pozadovanyCas=0;
//    }

    double prescas(){
    return pozadovanyCas-odpracovanyCas;}
public String toString(){
Integer p=Kolikátý;
return p.toString();
}
    public long getOdpracovanyCas() {
        return odpracovanyCas;
    }

    public void setOdpracovanyCas(long odpracovanyCas) {
        this.odpracovanyCas = odpracovanyCas;
    }
    
    
    
    
    
}
