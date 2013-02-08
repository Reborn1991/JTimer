/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwork.counter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Honza
 */
public class IO {
    Mounth Actual;

    public IO(Integer seznamFile) throws IOException, ClassNotFoundException {
  ObjectInputStream vstup = null;
  
  try{
            try {
                vstup= new ObjectInputStream(new BufferedInputStream(new FileInputStream(seznamFile.toString())));
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        finally{
        if(vstup==null){Actual= new Mounth(seznamFile, 88);return;}
        Actual=(Mounth) vstup.readObject();
        vstup.close();}
    }
    
 public void  zapsat() throws IOException{
     Integer cesta=Actual.Kolikátý;
 ObjectOutputStream vystup=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(cesta.toString())));
vystup.writeObject(Actual);
vystup.close();}
 
}
