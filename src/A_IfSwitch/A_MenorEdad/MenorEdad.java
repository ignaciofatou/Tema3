/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_IfSwitch.A_MenorEdad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ignacio
 */
public class MenorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            System.out.print("Introduzca su Edad: ");
            int numero = Integer.parseInt(br.readLine());
            
            if (numero < 18)
                System.out.println("Es menor de Edad");
            else
                System.out.println("Es mayor de Edad");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }        
    }    
}
