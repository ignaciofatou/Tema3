/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_IfSwitch.B_PositivoNegativo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ignacio
 */
public class PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            System.out.print("Introduzca el Importe: ");
            double importe = Double.parseDouble(br.readLine());
            
            if (importe >= 0)
                System.out.println("Cantidad Positiva");
            else
                System.out.println("Cantidad Negativa");
            
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
