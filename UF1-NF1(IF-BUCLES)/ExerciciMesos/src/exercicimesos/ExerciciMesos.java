/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicimesos;

import java.util.Scanner;

/**
 *
 * @author jofa7500
 */
public class ExerciciMesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char mes;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la inicial de un mes desde enero hasta abril");
        mes = sc.next().charAt(0);
        switch (mes)
        {
                case 'e':
                case 'E':
                System.out.println("ENERO");
                break;
                case 'f':
                case'F':
                System.out.println("FEBRERO");
                break;
                case 'm':
                case 'M':
                System.out.println("MARZO");
                break;
                case 'a':
                case 'A':
                System.out.println("ABRIL");
                break;
                default:
                    System.out.println("Letra no valida");
                    break;
        }
    }
    
}
