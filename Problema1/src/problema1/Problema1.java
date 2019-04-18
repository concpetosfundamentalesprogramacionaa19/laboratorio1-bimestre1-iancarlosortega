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
    
    

    
    public static void main(String[] args) {
        
    //Declaracion de variables   
       int horas = 100;
       int costo;
       int total;
       int descuento;
       
    //Creacion de un scan para poder ingresar valores mediante el teclado
       Scanner scan = new Scanner(System.in);
       System.out.println("Por favor ingrese el costo hora oficial:\n ");
       costo = scan.nextInt();
    //Operacion para poder calcular el total a pagar del trabajador  
       total = costo * horas;
    //Descuento al seguro social (10% del total a pagar)  
       descuento = total/10;
    //Mostrar en pantalla el sueldo mensual del trabajador   
       System.out.printf("El sueldo mensual es : %d",descuento);
       
                 
        
        
    }
    
}
