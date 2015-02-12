/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_IfSwitch.F_Calculadora;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ignacio
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            
            System.out.print("Introduzca Primer Numero: ");
            int numero1 = Integer.parseInt(br.readLine());
            
            System.out.print("Introduzca Segundo Numero: ");
            int numero2 = Integer.parseInt(br.readLine());
            
            System.out.print("Introduzca Operador: ");
            String operador = br.readLine();
            double resultado = 0;
            
            switch(operador){
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    break;
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "%":
                    resultado = numero1 % numero2;
                    break;
                default:
                    System.out.println("Error: Operador '"+operador+"' Inválido");
            }
            
            System.out.println("Resultado: " + numero1 + " " + operador + " " + numero2 + " = " + resultado);
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
}
