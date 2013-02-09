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
    
    public IO() throws IOException, ClassNotFoundException {
  ObjectInputStream vstup = null;
   ObjectInputStream vstup1 = null;
   
  
  try{
      vstup= new ObjectInputStream(new BufferedInputStream(new FileInputStream(pointerName)));
  pointer=(Pointer)vstup.readObject();
  vstup.close(); }
  
  finally{
     if(pointer==null){ pointer= new Pointer();   }
 
  
 }
      Integer path=pointer.getPointer();    
  try {
                
                vstup1= new ObjectInputStream(new BufferedInputStream(new FileInputStream(path.toString())));
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        finally{
        if(vstup1==null){Actual= new Mounth(path, 88);vstup1.close();return;}
        Actual=(Mounth) vstup.readObject();
        vstup1.close();}
    }
    
 public void  zapsat() throws IOException{
     Integer path=pointer.getPointer();
     ObjectOutputStream vystup=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(pointerName)));
vystup.writeObject(pointer);
vystup.close();

vystup=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path.toString())));
vystup.writeObject(Actual);
vystup.close();}
 
}
