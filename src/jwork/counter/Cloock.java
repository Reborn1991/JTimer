/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jwork.counter;

import java.util.Timer;
import java.util.TimerTask;

    
/**
 *
 * @author Honza
 */
public class Cloock{
   private Timer stopwatch;
   private TimerTask jobTime;
   

    public Cloock() {
        this.stopwatch = new Timer();
    jobTime=new TimerTask() {

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        }

   
}
