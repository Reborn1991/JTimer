/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwork.counter;

import java.io.IOException;

/**
 *
 * @author pavel
 */
public class JworkCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    Pointer p =    new Pointer();
    p.newMounth();
        System.out.println( p.getPointer());
    

        // TODO code application logic here
    }
}
