/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author l_a_b
 */
public class Director extends Thread{
    
    private int hourlyWage = (100/24);
    private Contador counter;
    private int daysLeft;
    private String activity = "Nada";
    private int act = 0; // 0 = nada, 1 = viendo contador, 2 = haciendo entregas, 3 = viendo al PM, 4 = reseteando counter
    private int timesPMCaught = 0;
    private Gerente manager;
    private boolean start = true;
    
    
    public Director(Contador counter, Gerente manager){
        this.counter = counter;
        this.manager = manager;
    }
    
    public void deliver(){
        activity = "Haciendo entregas";
        act = 2;
    }
    
    public void resetCounter(){
        activity = "Reiniciando contador";
        act = 4;
        this.counter.setDaysLeft(this.counter.getInitCounter());
    }
    
    public void checkPM(){
        if(this.manager.getAct() == 1){
                    this.manager.setCaptured(true);
                    this.timesPMCaught ++;
                    this.manager.setCaptured(false);
                    
                }
                else{}
    }
    
    @Override
    public void run(){
        while(start){
            int timeWatchingPM = (int)(Math.random()*(91-30)+30);
            int timeSpent = (int)(Math.random()*(18-12)+12);
        try {
            this.counter.getAccessCounter().acquire();
            activity = "Viendo el contador";
            act = 1;
            this.daysLeft = this.counter.getDaysLeft();
            if(this.daysLeft == 0){
                deliver();
                resetCounter();
                this.counter.getAccessCounter().release();
                
            } else if(daysLeft != 0){
                this.counter.getAccessCounter().release();
                activity = "Nada";
                act = 0;
                Director.sleep((timeSpent)*(this.counter.getDayDuration()/24));
                activity = "Vigilando al PM";
                act = 3;
                checkPM();
                Director.sleep((timeWatchingPM)*(this.counter.getDayDuration()/(24*60)));
                checkPM();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    public String getActivity() {
        return activity;
    }

    public int getAct() {
        return act;
    }

    public int getTimesPMCaught() {
        return timesPMCaught;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
