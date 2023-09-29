/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprogramvariables;

import java.util.Scanner;
//llibreria de java
/**
 *
 * @author jofa7500
 */
public class FirstProgramVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        edad=18;
        System.out.println("Tu edad es " + edad);
        /*
        Haciendo "control+espacio" encontramos las variables
        que empiezan por la letra que
        ponemos.
        */
        int notaM03, notaM02, notaM05;
        //un objecte que escaneja dades de entrada
        //System.in indico que sigui per consola
        Scanner pantalla = new Scanner(System.in);
        /*
        Informar valor por el usuario
        */
        System.out.println("Que crees que sacaras en M03?");
        notaM03 = pantalla.nextInt();
        System.out.println("Que crees que sacaras en M02?");
        notaM02 = pantalla.nextInt();
        System.out.println("Que crees que sacaras en M05?");
        notaM05 = pantalla.nextInt();
        
        //notaM03 = 8;
        //notaM02 = 7;
        //notaM05 = 9;
        System.out.println("Mi nota en M03 un... " + notaM03);
        System.out.println("Mi nota en M02 un... " + notaM02);
        System.out.println("Mi nota en M05 un... " + notaM05);
       
        
    }
    
}
