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
public class Pointer implements Serializable{
   private int pointer;

    public Pointer() {
        this.pointer = 0;
    }

    public Pointer( Pointer p) {
        this.pointer = p.getPointer();
    }

    public int getPointer() {
        return pointer;
    }
    @Override
    public String toString(){
   Integer r=     pointer;
   return r.toString();
}
  void shift()  {
  pointer++;
  }

 }
    