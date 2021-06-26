package Clases;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        //Clase Scanner para leer desde teclado 
        Scanner ent = new Scanner( System.in );
        
        System.out.println("Escribe una cadena de caracteres:");
        //Se obtienen una cadena de caractres 
        String cadena = ent.nextLine();
        System.out.println("Tu escribiste: " + cadena + "\n");
        
        System.out.println("Escribe un numero:");
        //Se obtienen una cadena de caractres 
        int numero = ent.nextInt();
        System.out.println("Tu escribiste: " + numero + "\n");
        
        Obtenedor obtenedor = new Obtenedor();
        
        //Aqui se obtiene los datos del archivo 1
        System.out.println("Datos de Archivo 1:");
        obtenedor.obtenerDatos();
        
        //Aqui se agrega una palabra al archivo 2
        System.out.println("\nEscribe la palabra o frace que quieres agregar:");  
        String frace = ent.next();
        obtenedor.agregarDatos(frace);
    }
}
