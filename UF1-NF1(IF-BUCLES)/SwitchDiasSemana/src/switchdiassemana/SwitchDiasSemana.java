/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchdiassemana;

import java.util.Scanner;

/**
 *
 * @author jofa7500
 */
public class SwitchDiasSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dia;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Pon un numero del 1 al 7");
        dia = sc.nextInt();
        
        
        switch(dia) {
            case 1:
                System.out.println("Lunes");
                break;
                case 2:
                System.out.println("martes");
                break;
                case 3:
                System.out.println("miercoles");
                break;
                case 4:
                System.out.println("jueves");
                break;
                case 5:
                System.out.println("viernes");
                break;
                case 6:
                System.out.println("sabado");
                break;
                case 7:
                System.out.println("domingo");
                break;
                default:
                    System.out.println("No valido");
                    break;
        }
    }
    
}
