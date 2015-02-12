/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_IfSwitch.D_PositivoNegativoCero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ignacio
 */
public class PositivoNegativoCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            System.out.print("Introduzca Numero: ");
            int numero = Integer.parseInt(br.readLine());
            
            if (numero > 0)
                System.out.println("La Cantidad es Positiva");
            else if (numero < 0)
                System.out.println("La Cantidad es Negativa");
            else
                System.out.println("La Cantidad es Cero");
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
}
