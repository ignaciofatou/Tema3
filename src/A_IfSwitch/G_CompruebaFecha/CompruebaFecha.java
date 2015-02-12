/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_IfSwitch.G_CompruebaFecha;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ignacio
 */
public class CompruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            System.out.print("Introduzca día: ");
            int dia = Integer.parseInt(br.readLine());
            
            System.out.print("Introduzca mes: ");
            int mes = Integer.parseInt(br.readLine());
            
            System.out.print("Introduzca año: ");
            int year = Integer.parseInt(br.readLine());
            
            //Validamos los errores más comunes
            if ((dia > 31) | (dia < 1))
                System.out.println("Error, el dia no puede ser mayor a 31 ni menor a 1");
            if ((mes > 12) | (mes < 1))
                System.out.println("Error, el mes no puede ser mayor a 12 ni menor a 1");
            if (year > 9999)
                System.out.println("Error, el año no puede ser mayor a 9999");
            
            //Validamos los errores más complejos
            switch(mes){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia > 31)
                        System.out.println("Error, el dia no puede ser mayor a 31");
                    else
                        System.out.println("Fecha Correcta");
                    break;
                case 4: case 6: case 9: case 11:
                    if (dia > 30)
                        System.out.println("Error, el dia no puede ser mayor a 30");
                    else
                        System.out.println("Fecha Correcta");
                    break;
                case 2: 
                    if (dia > 29)
                        System.out.println("Error, el dia no puede ser mayor a 29");
                    else if ((dia == 29) & (!esBisiesto(year)))
                        System.out.println("Error, el dia no puede ser mayor a 28");
                    else
                        System.out.println("Fecha Correcta");
                    break;
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
    private static boolean esBisiesto(int year){        
        if (((year % 4) == 0.0) & (!(((year % 100) == 0.0) & ((year % 400) != 0.0))))
            return true;
        else 
            return false;
    }
    
}
