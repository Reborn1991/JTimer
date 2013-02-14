/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwork.counter;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author pavel
 */
public class JworkCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
  final IO a= new IO();
//        System.out.println(a.pointer);
//  
//        System.out.println(a.Actual.getOdpracovanyCas());
//ElapsedTime obj = new ElapsedTime(a);
//obj.setVisible(true);
//
//        System.out.println(a.Actual.getOdpracovanyCas());
//        System.out.println(obj.startTime);
        // TODO code application logic here
  
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stopWatchWindow(a).setVisible(true);
            }
   }
    );}
} 

