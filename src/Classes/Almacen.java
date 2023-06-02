/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.concurrent.Semaphore;

/**
 *
 * @author l_a_b
 */
public class Almacen {
    
    private int type; //1 = chasis, 2 = carroceria, 3 = motor, 4 = ruedas, 5 = accesorios 
    private int space;
    private Semaphore storageAcess;
    private Semaphore spaceAvailable;
    private Semaphore readyToConsume;
    private boolean[] slots;
    private Semaphore storage;
    private int in = 0;
    private int out = 0;
   

    public Almacen(int space) {
        this.space = space;
        this.storageAcess = new Semaphore(1);
        this.spaceAvailable = new Semaphore(space);
        this.readyToConsume = new Semaphore(0);
        this.slots = new boolean[space];
        this.storage = new Semaphore(space);
    }

    public int getSpace() {
        return space;
    }

    public Semaphore getStorageAcess() {
        return storageAcess;
    }

    public Semaphore getSpaceAvailable() {
        return spaceAvailable;
    }

    public Semaphore getReadyToConsume() {
        return readyToConsume;
    }

    public boolean[] getSlots() {
        return slots;
    }

    public int getIn() {
        return in;
    }

    public int getOut() {
        return out;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public void setStorageAcess(Semaphore storageAcess) {
        this.storageAcess = storageAcess;
    }

    public void setSpaceAvailable(Semaphore spaceAvailable) {
        this.spaceAvailable = spaceAvailable;
    }

    public void setReadyToConsume(Semaphore readyToConsume) {
        this.readyToConsume = readyToConsume;
    }

    public void setSlots(int i, boolean value) {
        this.slots[i] = value;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public void setOut(int out) {
        this.out = out;
    }
}
