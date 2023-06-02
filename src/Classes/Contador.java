/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author l_a_b
 */
public class Contador extends Thread{
    
    private int daysLeft;
    private int initCounter;
    private long dayDuration;
    private Semaphore accessCounter;
    private int hours = 0;
    private boolean start = true;
    
    public Contador(int daysLeft, long dayDuration, int initCounter){
        this.dayDuration = dayDuration;
        this.daysLeft = daysLeft;
        this.accessCounter = new Semaphore(1);
        this.initCounter = initCounter;
    }
    
    @Override
    public void run(){
        while(start){
            double countHours = this.dayDuration/(24);
        try {
            Contador.sleep((long)countHours);
        } catch (InterruptedException ex) {
            Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hours ++;
        }
        
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public long getDayDuration() {
        return dayDuration;
    }

    public Semaphore getAccessCounter() {
        return accessCounter;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public void setDayDuration(long dayDuration) {
        this.dayDuration = dayDuration;
    }

    public void setAccessCounter(Semaphore accessCounter) {
        this.accessCounter = accessCounter;
    }

    public int getInitCounter() {
        return initCounter;
    }

    public void setInitCounter(int initCounter) {
        this.initCounter = initCounter;
    }

    public int getHours() {
        return hours;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
