/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import GUI.Control;
import GUI.Menu;
import Files.Lector;

/**
 *
 * @author l_a_b
 */
public class Planta {
    
    private Semaphore accessCarsCounter;
    private int carsCounter = 0;
    private Lector lector;
    ArrayList<Creador> creators = new ArrayList<>();
    ArrayList<Ensamblador> assemblers = new ArrayList<>();
    private Gerente manager;
    private Director director;
    private Contador counter;
    private Almacen chasisStorage, carroceriasStorage, motoresStorage, ruedasStorage, accesoriosStorage;
    private final double chasisWage = 5, carroceriaWage = 3, motorWage = 7, ruedasWage = 7.5, accesoriosWage = 10;
    private final double chasisProduction = 2.0, carroceriaProduction = 2.0, motorProduction = 1.0/3.0, ruedasProduction = 1.0/2.0, accesoriosProduction = 1.0/2.0;
    private final double assemblerProduction = 1.0/2.0;
    private final double assemblerWage = 8;
    private boolean start = true;
    private Menu menu;
    
    public Planta(Lector lector, Menu menu){
        this.accessCarsCounter = new Semaphore(1);
        this.lector = lector;
        this.menu = menu;
    }
    
    public void createStorages(){
        chasisStorage = new Almacen(this.lector.getChasisCapacity());
        carroceriasStorage = new Almacen(this.lector.getCarroceriasCapacity());
        motoresStorage = new Almacen(this.lector.getMotoresCapacity());
        ruedasStorage = new Almacen(this.lector.getRuedasCapacity());
        accesoriosStorage = new Almacen(this.lector.getAccesoriosCapacity());
    }
    
    public void hireCreator(int type){
        
        switch(type){
            case 1 -> this.creators.add(new Creador(type, this.chasisWage, this.chasisProduction, this.chasisStorage, this.manager));
            case 2 -> this.creators.add(new Creador(type, this.carroceriaWage, this.carroceriaProduction, this.carroceriasStorage, this.manager));
            case 3 -> this.creators.add(new Creador(type, this.motorWage, this.motorProduction, this.motoresStorage, this.manager));
            case 4 -> this.creators.add(new Creador(type, this.ruedasWage, this.ruedasProduction, this.ruedasStorage, this.manager));
            case 5 -> this.creators.add(new Creador(type, this.accesoriosWage, this.accesoriosProduction, this.accesoriosStorage, this.manager));
        }   
    }
    
    public void hireAssembler(){
        this.assemblers.add(new Ensamblador(this.assemblerProduction, this.assemblerWage, manager, this.chasisStorage, this.carroceriasStorage, this.motoresStorage, this.ruedasStorage, this.accesoriosStorage, this));
    }
    
    public void hireManager(long dayDuration, Contador counter, double hourlyWage, int id){
        this.manager = new Gerente(dayDuration, counter, hourlyWage, id);
    }
    
    public void hireDirector(Contador counter, Gerente manager){
        this.director = new Director(counter, manager);
    }
    
    public void hireCounter(int daysLeft, long dayDuration, int initCounter){
        this.counter = new Contador(daysLeft, dayDuration, initCounter);
    }
    
    public void fireCreator(int type){
        for(int i = 0; i<creators.size(); i++){
            if(this.creators.get(i).getType() == type){
                this.creators.get(i).setStart(false);
                this.creators.remove(i);
                break;
            }
        }
    }
    
    public void fireAssembler(){
        this.assemblers.get(0).setStart(false);
        this.assemblers.remove(0);
    }
    
    public double creatorOfTypeSalary(int type){
        int workingHours = 0;
        double salary = 0;
        for(int i = 0; i<creators.size(); i++){
            if(creators.get(i).getType() == type){
                workingHours += creators.get(i).getWorkingHours();
                salary = workingHours * creators.get(i).getHourlyWage();
            }
        }
        return salary;
    }
    
    public double allCreatorsSalary(){
        double salary = 0;
        for(int i = 0; i < creators.size(); i++){
            int workingHours = 0;
            workingHours += creators.get(i).getWorkingHours();
            switch(creators.get(i).getType()){
                case 1: salary += workingHours * chasisWage;
                break;
                case 2: salary += workingHours * carroceriaWage;
                break;
                case 3: salary += workingHours * motorWage;
                break;
                case 4: salary += workingHours * ruedasWage;
                break;
                case 5: salary += workingHours * accesoriosWage;
                break;
            }
        }
        return salary;
    }
    
    public double assemblersSalary(){
        double salary = 0;
        for(int i = 0; i < assemblers.size(); i++){
            int workingHours = 0;
            workingHours += assemblers.get(i).getWorkingHours();
            salary = workingHours * assemblers.get(i).getHourlyWage();
            }
        return salary;
    }
    
    public double directorSalary(){
        double salary = 0;
        return salary = manager.getDays() * 100;
    }
    
    public double managerSalary(){
        double salary = 0;
        int workingHours = manager.getWorkingHours();
        salary = (workingHours * manager.getHourlyWage()) - director.getTimesPMCaught();
        return salary;
    }
    
    public void initConditions(){
        hireCounter(this.lector.getDaysBetweenLaunches(), this.lector.getDayDuration()*1000, this.lector.getDaysBetweenLaunches());
        hireManager(this.counter.getDayDuration(), this.counter, 7, 5);
        hireDirector(this.counter, this.manager);
        createStorages();
        for(int i = 0; i<lector.getChasisCreators(); i++){
            hireCreator(1);
        }
        for(int i = 0; i<lector.getCarroceriasCreators(); i++){
            hireCreator(2);
        }
        for(int i = 0; i<lector.getMotoresCreators(); i++){
            hireCreator(3);
        }
        for(int i = 0; i<lector.getRuedasCreators(); i++){
            hireCreator(4);
        }
        for(int i = 0; i<lector.getAccesoriosCreators(); i++){
            hireCreator(5);
        }   
        for(int i = 0; i<lector.getAssemblers(); i++){
            hireAssembler();
        } 
        this.counter.start();
        this.manager.start();
        this.director.start();
        for(int i = 0; i < creators.size(); i++){
            creators.get(i).start();
        }
        for(int i = 0; i < assemblers.size(); i++){
            assemblers.get(i).start();
        }
    }
    
//    public double salary(){
//        this.manager.getDays();
//    }
    
    public void stop(){
        this.manager.setStart(false);
        this.director.setStart(false);
        this.counter.setStart(false);
        for(int i = 0; i < creators.size(); i++){
            creators.get(i).setStart(false);
        }
        for(int i = 0; i < assemblers.size(); i++){
            assemblers.get(i).setStart(false);
        }
    }
    
    public void resume(){
        this.manager.setStart(true);
//        this.manager.start();
        this.director.setStart(true);
//        this.director.start();
        for(int i = 0; i < creators.size(); i++){
            creators.get(i).setStart(true);
//            producers.get(i).start();
        }
        for(int i = 0; i < assemblers.size(); i++){
            assemblers.get(i).setStart(true);
//            assemblers.get(i).start();
        }     
    }
    
    public int getCreatorOfType(int type){
        int count = 0;
        for(int i = 0; i<this.creators.size(); i++){
            if(this.creators.get(i).getType() == type){
                count++;
            }
        }
        return count;
    }

    public Semaphore getAccessCarsCounter() {
        return accessCarsCounter;
    }

    public int getCarsCounter() {
        return carsCounter;
    }

    public Lector getLector() {
        return lector;
    }

    public ArrayList<Creador> getCreators() {
        return creators;
    }

    public ArrayList<Ensamblador> getAssemblers() {
        return assemblers;
    }

    public Gerente getManager() {
        return manager;
    }

    public Director getDirector() {
        return director;
    }

    public Contador getCounter() {
        return counter;
    }

    public Almacen getChasisStorage() {
        return chasisStorage;
    }

    public Almacen getCarroceriasStorage() {
        return carroceriasStorage;
    }

    public Almacen getMotoresStorage() {
        return motoresStorage;
    }

    public Almacen getRuedasStorage() {
        return ruedasStorage;
    }

    public Almacen getAccesoriosStorage() {
        return accesoriosStorage;
    }

    public double getChasisWage() {
        return chasisWage;
    }

    public double getCarroceriaWage() {
        return carroceriaWage;
    }

    public double getMotorWage() {
        return motorWage;
    }

    public double getRuedasWage() {
        return ruedasWage;
    }

    public double getAccesoriosWage() {
        return accesoriosWage;
    }

    public double getChasisProduction() {
        return chasisProduction;
    }

    public double getCarroceriaProduction() {
        return carroceriaProduction;
    }

    public double getMotorProduction() {
        return motorProduction;
    }

    public double getRuedasProduction() {
        return ruedasProduction;
    }

    public double getAccesoriosProduction() {
        return accesoriosProduction;
    }

    public double getAssemblerProduction() {
        return assemblerProduction;
    }

    public double getAssemblerWage() {
        return assemblerWage;
    }

    public boolean isStart() {
        return start;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setAccessEpisodesCounter(Semaphore accessEpisodesCounter) {
        this.accessCarsCounter = accessEpisodesCounter;
    }

    public void setEpisodeCounter(int episodeCounter) {
        this.carsCounter = episodeCounter;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setCreators(ArrayList<Creador> creators) {
        this.creators = creators;
    }

    public void setAssemblers(ArrayList<Ensamblador> assemblers) {
        this.assemblers = assemblers;
    }

    public void setManager(Gerente manager) {
        this.manager = manager;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setCounter(Contador counter) {
        this.counter = counter;
    }

    public void setChasisStorage(Almacen chasisStorage) {
        this.chasisStorage = chasisStorage;
    }

    public void setCarroceriasStorage(Almacen carroceriasStorage) {
        this.carroceriasStorage = carroceriasStorage;
    }

    public void setMotoresStorage(Almacen motoresStorage) {
        this.motoresStorage = motoresStorage;
    }

    public void setRuedasStorage(Almacen ruedasStorage) {
        this.ruedasStorage = ruedasStorage;
    }

    public void setAccesoriosStorage(Almacen accesoriosStorage) {
        this.accesoriosStorage = accesoriosStorage;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    
    
}
