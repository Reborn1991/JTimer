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
                ioPointer();
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        ioMounth();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void ioPointer() throws IOException, ClassNotFoundException {
        ObjectInputStream vstup = null;
        try{
        vstup= new ObjectInputStream(new BufferedInputStream(new FileInputStream(pointerName)));}
        finally{
        if(vstup==null){ pointer=new Pointer();return;}
       
    pointer=(Pointer) vstup.readObject();
    vstup.close();
        }
        
   }
private void ioMounth() throws IOException, ClassNotFoundException {
        ObjectInputStream vstup = null;
        try{
        vstup= new ObjectInputStream(new BufferedInputStream(new FileInputStream(pointer.toString())));}
        finally{
        if(vstup==null){ Actual= new Mounth(1, 88); return;}
         
     Actual= (Mounth) vstup.readObject();
     vstup.close();
        }
    }
public void save(){
savePointer();
saveMounth();}

private void savePointer(){
    ObjectOutputStream vystup = null;

        try{
        vystup= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(pointerName)));
        vystup.writeObject(pointer);}
        catch (IOException ex) {        
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally{
        try {
            vystup.close();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        }

}
private void saveMounth(){
    ObjectOutputStream vystup = null;

        try{
        vystup= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(Actual.toString())));
        vystup.writeObject(Actual);}
        catch (IOException ex) {        
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally{
        try {
            vystup.close();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        }

}
public void newMounth(){
save();
pointer.shift();
Actual=new Mounth(pointer.getPointer(),88);
save();
}
}
