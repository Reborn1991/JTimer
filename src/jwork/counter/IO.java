/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwork.counter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Honza
 */
public class IO {
    Pointer pointer;
    Mounth Actual;
 static private  String pointerName = "point";

    public IO() {
        try {
            try {
                this.pointer = ioPointer();
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.Actual=ioMounth();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private Pointer ioPointer() throws IOException, ClassNotFoundException {
        ObjectInputStream vstup = null;
        try{
        vstup= new ObjectInputStream(new BufferedInputStream(new FileInputStream(pointerName)));}
        finally{
        if(vstup==null){ vstup.close();return new Pointer();}
         vstup.close();
     return (Pointer) vstup.readObject();
        }
        
   }
private Mounth ioMounth() throws IOException, ClassNotFoundException {
        ObjectInputStream vstup = null;
        try{
        vstup= new ObjectInputStream(new BufferedInputStream(new FileInputStream(pointer.toString())));}
        finally{
        if(vstup==null){ vstup.close();return new Mounth(1, 88);}
         vstup.close();
     return (Mounth) vstup.readObject();
        }
    }


}
