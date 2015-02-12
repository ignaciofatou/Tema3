/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Bucles.A_ListaNumeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ignacio
 */
public class ListaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            System.out.println("Programa que muestra los números a partir del 1 y hasta el número que indique el usuario");
            System.out.print("Introduzca Numero Fin: ");
            int numFin = Integer.parseInt(br.readLine());
            int contador = 0;
            
            while (contador < numFin){
                contador++;
                System.out.print(contador + "-");
            }            
            System.out.println("\nFin");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }  
    }
    
}
