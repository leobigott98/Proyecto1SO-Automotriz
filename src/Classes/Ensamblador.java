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
public class Ensamblador extends Thread{
    
    private double dailyProductionCapacity;
    private double hourlyWage;
    private Gerente manager;
    private Almacen chasis, carrocerias, motores, ruedas, accesorios;
    private Planta planta;
    private boolean start = true;
    private int workingHours = 0;
    
    //The Last Of Us (Animada): 1 Intro, 2 Inicios, 2 cierre/plotTwist, 1 credito ➔ Audiencia: 1.1M por capitulo

    public Ensamblador(double dailyProductionCapacity, double hourlyWage, Gerente manager, Almacen chasis, Almacen carrocerias, Almacen motores, Almacen ruedas, Almacen accesorios, Planta planta) {
        this.dailyProductionCapacity = dailyProductionCapacity;
        this.hourlyWage = hourlyWage;
        this.manager = manager;
        this.chasis = chasis;
        this.carrocerias = carrocerias;
        this.motores = motores;
        this.ruedas = ruedas;
        this.accesorios = accesorios;
        this.planta = planta;
    }
    
    public void getFromStorage(Almacen storage, int amount){
        storage.setSlots(storage.getOut(), false);
        storage.setOut((storage.getOut()+amount)%storage.getSpace());
    }
    
    public void assemble(){
        try {
            Ensamblador.sleep((long)(this.dailyProductionCapacity*manager.getDayDuration()));
            this.planta.setEpisodeCounter(this.planta.getCarsCounter()+1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gather(Almacen storage, int amount){
        try {
        storage.getReadyToConsume().acquire(amount);
        storage.getStorageAcess().acquire();
        getFromStorage(storage, amount);
        storage.getStorageAcess().release();
//        drive.getReadyToConsume().release();
        storage.getSpaceAvailable().release(amount);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void run(){
        int chasis =1, carrocerias =2, motores =1, ruedas =2, accesorios =2, count=3;
        switch(planta.getMenu().getCarro()){
            case "Bugatti": chasis =1; carrocerias = 2; motores = 4; ruedas = 4; accesorios = 2; count = 5;
            break;
            case "Lamborghini": chasis =2; carrocerias = 1; motores = 6; ruedas = 5; accesorios = 1; count = 3;
            break;
            case "Maserati": chasis =1; carrocerias = 1; motores = 2; ruedas = 4; accesorios = 3; count = 2;
            break;
            case "Rolls Royce": chasis =3; carrocerias = 2; motores = 4; ruedas = 6; accesorios = 5; count = 6;
            break;
        }
        while(start){
            int tik = this.planta.getCounter().getHours();
        gather(this.chasis, chasis);
        gather(this.carrocerias, carrocerias);
        gather(this.motores, motores);
        gather(this.ruedas, ruedas);
        try {
            this.planta.getAccessCarsCounter().acquire();
            if(this.planta.getCarsCounter()== count){
                gather(this.accesorios, accesorios);
            }
            assemble();
            this.planta.getAccessCarsCounter().release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.workingHours += this.planta.getCounter().getHours() - tik;
        }
        
    }

    public double getDailyProductionCapacity() {
        return dailyProductionCapacity;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public Gerente getManager() {
        return manager;
    }

    public Almacen getChasis() {
        return chasis;
    }

    public Almacen getCarrocerias() {
        return carrocerias;
    }

    public Almacen getMotores() {
        return motores;
    }

    public Almacen getRuedas() {
        return ruedas;
    }

    public Almacen getAccesorios() {
        return accesorios;
    }

    public Planta getPlanta() {
        return planta;
    }

    public boolean isStart() {
        return start;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setDailyProductionCapacity(double dailyProductionCapacity) {
        this.dailyProductionCapacity = dailyProductionCapacity;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setManager(Gerente manager) {
        this.manager = manager;
    }

    public void setChasis(Almacen chasis) {
        this.chasis = chasis;
    }

    public void setCarrocerias(Almacen carrocerias) {
        this.carrocerias = carrocerias;
    }

    public void setMotores(Almacen motores) {
        this.motores = motores;
    }

    public void setRuedas(Almacen ruedas) {
        this.ruedas = ruedas;
    }

    public void setAccesorios(Almacen accesorios) {
        this.accesorios = accesorios;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    
    
}
