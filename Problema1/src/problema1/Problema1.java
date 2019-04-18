/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Problema1 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int horas = 100;
       int costo;
       int total;
       int descuento;
       
      
       Scanner scan = new Scanner(System.in);
       System.out.println("Por favor ingrese el costo hora oficial: ");
       costo = scan.nextInt();
       
       total = costo * horas;
       
       descuento = total/10;
       
       System.out.printf("El sueldo mensual es : %d",descuento);
       
                 
        
        
    }
    
}
