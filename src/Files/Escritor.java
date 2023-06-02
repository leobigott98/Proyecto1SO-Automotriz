/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author l_a_b
 */
public class Escritor {
    
    private File file;

public void CreateFile() {
    try {
        long timeStamp = System.currentTimeMillis();
        String time = String.valueOf(timeStamp);
        this.file = new File("C:\\Users\\l_a_b\\Dropbox\\PC\\Documents\\NetBeansProjects\\Proyecto1SOBigott\\src\\archivos\\"+time+" Parameters.csv");
        file.createNewFile();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

public void WriteToFile(int[] parameters) {
    try {
      FileWriter writer = new FileWriter(this.file);
      writer.write("Day Duration,"+parameters[0]+"\r");
      writer.write("Days between launches,"+parameters[1]+"\r");
      writer.write("Chasis Capacity,"+parameters[2]+"\r");
      writer.write("Carrocerias Capacity,"+parameters[3]+"\r");
      writer.write("Motores Capacity,"+parameters[4]+"\r");
      writer.write("Ruedas Capacity,"+parameters[5]+"\r");
      writer.write("Accesorios Capacity,"+parameters[6]+"\r");
      writer.write("Chasis Creators,"+parameters[7]+"\r");
      writer.write("Carrocerias Creators,"+parameters[8]+"\r");
      writer.write("Motores Creators,"+parameters[9]+"\r");
      writer.write("Ruedas Creators,"+parameters[10]+"\r");
      writer.write("Accesorios Creators,"+parameters[11]+"\r");
      writer.write("Assemblers,"+parameters[12]+"\r");
      writer.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    JOptionPane.showMessageDialog(null, "Parámetros Configurados con éxito");
}

    public File getFile() {
        return file;
    }
    
}
