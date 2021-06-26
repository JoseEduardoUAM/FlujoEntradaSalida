package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Obtenedor {
    
    public Obtenedor(){
    }
    
    public void obtenerDatos(){
        try {
            Scanner entrada = new Scanner(new File("Archivos de Textos/Archivo1.txt"));
            while( entrada.hasNext() ){
                System.out.println( entrada.nextLine() );
            }
        } catch (FileNotFoundException ex) {
            System.out.println("En la clase Obtenedor:\n" + ex);
        }
    }
    
    public void agregarDatos( String palabra ){
        BufferedWriter bw = null;
        FileWriter fw = null;  
        
        try {
            File archivo = new File("Archivos de Textos/Archivo2.txt");
            fw = new FileWriter(archivo.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write( "\n"+palabra );
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if(bw != null) bw.close();
                if(fw != null) fw.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }          
    }
    
}
