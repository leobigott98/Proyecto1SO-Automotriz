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
public class Creador extends Thread{

    private int type; //1 = chasis, 2 = carroceria, 3 = motor, 4 = ruedas, 5 = accesorios 
    private double hourlyWage;
    private double dailyProductionCapacity;
    private Almacen storage;
    private Gerente manager;  
    private boolean start = true;
    private int workingHours = 0;
    
    public Creador(){
        
    }
    
    public Creador(int type, double hourlyWage, double dailyProductionCapacity, Almacen storage, Gerente manager) {
        this.type = type;
        this.hourlyWage = hourlyWage;
        this.dailyProductionCapacity = dailyProductionCapacity;
        this.storage = storage;
        this.manager = manager;
    }
    
    public void create (){
        
        try {
            Creador.sleep((long)(this.dailyProductionCapacity*this.manager.getDayDuration()));
            } catch (InterruptedException ex) {
                Logger.getLogger(Creador.class.getName()).log(Level.SEVERE, null, ex);
            }

        switch(this.type){
            case 1 -> System.out.println("Chasis produced");
            case 2 -> System.out.println("Carroceria produced");
            case 3 -> System.out.println("Motor produced");
            case 4 -> System.out.println("Ruedas produced");
            case 5 -> System.out.println("Accesorios produced");
        }        
    }
    
    public void saveToStorage(){
        this.storage.setSlots(this.storage.getIn(), true);
        this.storage.setIn((this.storage.getIn()+1)%this.storage.getSpace());      
    }
    
    @Override
    public void run(){
        while(start){
            int tik = this.manager.getCounter().getHours();
        try {
            create();
            this.storage.getSpaceAvailable().acquire();
            this.storage.getStorageAcess().acquire();
            saveToStorage();
            this.storage.getStorageAcess().release();
            this.storage.getReadyToConsume().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Creador.class.getName()).log(Level.SEVERE, null, ex);
        } 
        this.workingHours += this.manager.getCounter().getHours() - tik;
        }
    }

    public int getType() {
        return type;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getDailyProductionCapacity() {
        return dailyProductionCapacity;
    }

    public Almacen getStorage() {
        return storage;
    }

    public Gerente getManager() {
        return manager;
    }

    public boolean isStart() {
        return start;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setDailyProductionCapacity(double dailyProductionCapacity) {
        this.dailyProductionCapacity = dailyProductionCapacity;
    }

    public void setStorage(Almacen storage) {
        this.storage = storage;
    }

    public void setManager(Gerente manager) {
        this.manager = manager;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    
    
    
}
