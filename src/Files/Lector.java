/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author l_a_b
 */
public class Lector {
    
    private Scanner sc, scl;
    private File file;
    private int dayDuration, daysBetweenLaunches, chasisCapacity, carroceriasCapacity, motoresCapacity, ruedasCapacity;
    private int accesoriosCapacity, chasisCreators, carroceriasCreators, motoresCreators, ruedasCreators, accesoriosCreators;
    private int assemblers;

    public Lector() {
    }
    
    public void readFile(File file){
        try {
            this.sc = new Scanner(file);
            //parsing a CSV file into the constructor of Scanner class 
            sc.useDelimiter("\r");
            //setting comma as delimiter pattern
            int count = 0;
            while (sc.hasNext()) {
                String line = sc.next();
                scl = new Scanner(line);
                scl.useDelimiter(",");
                while(scl.hasNext()){
                    String word = scl.next();
                    switch(count){
                        case 1: this.dayDuration = Integer.parseInt(word);
                        break;
                        case 3: this.daysBetweenLaunches = Integer.parseInt(word);
                        break;
                        case 5: this.chasisCapacity = Integer.parseInt(word);
                        break;
                        case 7: this.carroceriasCapacity = Integer.parseInt(word);
                        break;
                        case 9: this.motoresCapacity = Integer.parseInt(word);
                        break;
                        case 11: this.ruedasCapacity = Integer.parseInt(word);
                        break;
                        case 13: this.accesoriosCapacity = Integer.parseInt(word);
                        break;
                        case 15: this.chasisCreators = Integer.parseInt(word);
                        break;
                        case 17: this.carroceriasCreators = Integer.parseInt(word);
                        break;
                        case 19: this.motoresCreators = Integer.parseInt(word);
                        break;
                        case 21: this.ruedasCreators = Integer.parseInt(word);
                        break;
                        case 23: this.accesoriosCreators = Integer.parseInt(word);
                        break;
                        case 25: this.assemblers = Integer.parseInt(word);
                        break;
                    }
                    count++;
                    System.out.println(word);
//                    
//                    scw = new Scanner(word);
                }
                scl.close();
            }
            sc.close();
            JOptionPane.showMessageDialog(null, "Archivo cargado con éxito");
            //closes the scanner  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 

    public Scanner getSc() {
        return sc;
    }

    public Scanner getScl() {
        return scl;
    }

    public File getFile() {
        return file;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public int getDaysBetweenLaunches() {
        return daysBetweenLaunches;
    }

    public int getChasisCapacity() {
        return chasisCapacity;
    }

    public int getCarroceriasCapacity() {
        return carroceriasCapacity;
    }

    public int getMotoresCapacity() {
        return motoresCapacity;
    }

    public int getRuedasCapacity() {
        return ruedasCapacity;
    }

    public int getAccesoriosCapacity() {
        return accesoriosCapacity;
    }

    public int getChasisCreators() {
        return chasisCreators;
    }

    public int getCarroceriasCreators() {
        return carroceriasCreators;
    }

    public int getMotoresCreators() {
        return motoresCreators;
    }

    public int getRuedasCreators() {
        return ruedasCreators;
    }

    public int getAccesoriosCreators() {
        return accesoriosCreators;
    }

    public int getAssemblers() {
        return assemblers;
    }
    
    
}
