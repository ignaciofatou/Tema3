/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_IfSwitch.E_OrdenarNumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ignacio
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            System.out.print("Introduzca Primer Numero: ");
            double numero1 = Double.parseDouble(br.readLine());
            
            System.out.print("Introduzca Segundo Numero: ");
            double numero2 = Double.parseDouble(br.readLine());
            
            System.out.print("Introduzca Tercer Numero: ");
            double numero3 = Double.parseDouble(br.readLine());
            
            System.out.print("Numeros Ordenados: ");
            
            
            if ((numero1 > numero2) & (numero1 > numero3)){
                System.out.print(numero1);
                if (numero2 > numero3){
                    System.out.print(", "+numero2);
                    System.out.print(", "+numero3);
                }
                else{
                    System.out.print(", "+numero3);
                    System.out.print(", "+numero2);
                }
            }
            else if ((numero2 > numero1) & (numero2 > numero3)){
                System.out.print(numero2);
                if (numero1 > numero3){
                    System.out.print(", "+numero1);
                    System.out.print(", "+numero3);
                }
                else{
                    System.out.print(", "+numero3);
                    System.out.print(", "+numero1);
                }
            }
            else{
                System.out.print(numero3);
                if (numero1 > numero2){
                    System.out.print(", "+numero1);
                    System.out.print(", "+numero2);
                }
                else{
                    System.out.print(", "+numero2);
                    System.out.print(", "+numero1);
                }
            }
            System.out.println();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
}
