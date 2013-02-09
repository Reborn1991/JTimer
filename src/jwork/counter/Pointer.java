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
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Honza
 */
public class Pointer implements Serializable{
   private int pointer;

 private static Pointer instance;
//Vytvorime soukromy konstruktor
private Pointer(){}
//metoda pro vytvoreni objektu jedinacek
public static Pointer getInstance(){
//Jestliže je promenna instance rovna null, tak se vxtvori objekt
if (instance == null) {
instance = new Pointer();
}
//navrátíme objekt
return instance;}

 }
    