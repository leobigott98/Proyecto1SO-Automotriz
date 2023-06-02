/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;
import GUI.Control;

/**
 *
 * @author l_a_b
 */
public class Gerente extends Thread{
    
    private long dayDuration; //Duracion de 1 día en milisegundos
    private Contador counter;
    private double hourlyWage;
    private int id;
    public int days, hours;
    private Control ventana;
    private String activity = "Contabilidad";
    private int act = 0; //0 = contabilidad, 1 = viendo Carreras
    private boolean captured = false;
    private boolean start = true;
    private int workingHours;
    
    public Gerente(long dayDuration, Contador counter, double hourlyWage, int id){
        this.dayDuration = dayDuration;
        this.counter = counter;
        this.hourlyWage = hourlyWage;
        this.id = id;
    }
    
    public double timeToDecrease(double dayDuration, int id){
        return (dayDuration/24)*(id+1);
    }
    
    public void losingTime(long dayDuration, int id){
        double decrease = timeToDecrease((double)this.dayDuration, this.id);
        double activityTime = (((double)this.dayDuration)/(24*60))*(15+id);
        double rest = dayDuration - decrease;
        double intervals = rest/activityTime;
        for(int i = 0; i<intervals; i+=2){
            try {
                this.activity = "Gerente viendo Carreras";
                this.act = 1;
                Gerente.sleep((long)(activityTime));
                this.activity = "Gerente revisando la Contabilidad";
                this.act = 0;
                Gerente.sleep((long)(activityTime));
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void run(){
        while(start){
            int tik = this.counter.getHours();
        losingTime(this.dayDuration, this.id);
        try {  
            this.counter.getAccessCounter().acquire();
            this.activity = "PM reduciendo el contador";
            this.act = 3;
            Gerente.sleep((long)(timeToDecrease(this.dayDuration, this.id)));
            this.counter.setDaysLeft(this.counter.getDaysLeft()-1);
            this.activity = "Contador reducido";
            this.act = 4;
            this.counter.getAccessCounter().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.days ++;
        this.workingHours += this.counter.getHours() - tik;
        }
    }

    public long getDayDuration() {
        return dayDuration;
    }

    public Contador getCounter() {
        return counter;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getDays() {
        return days;
    }

    public int getHours() {
        return hours;
    }

    public Control getVentana() {
        return ventana;
    }

    public String getActivity() {
        return activity;
    }

    public int getAct() {
        return act;
    }

    public boolean isCaptured() {
        return captured;
    }

    public boolean isStart() {
        return start;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setDayDuration(long dayDuration) {
        this.dayDuration = dayDuration;
    }

    public void setCounter(Contador counter) {
        this.counter = counter;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setVentana(Control ventana) {
        this.ventana = ventana;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setAct(int act) {
        this.act = act;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    
    
    
    
}
