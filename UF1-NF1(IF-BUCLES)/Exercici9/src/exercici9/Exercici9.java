/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;

/**
 *
 * @author jofa7500
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
       
       Scanner pantalla = new Scanner (System.in);
       
        System.out.println("Escribe tu edad: ");
        edad = pantalla.nextInt();
        
        if (edad <18)
        {   //si es true
            System.out.println("Eres menor de edad!");
            
        }else{//si es false
            System.out.println("Eres mayor de edad!");
        }}
    
    }
