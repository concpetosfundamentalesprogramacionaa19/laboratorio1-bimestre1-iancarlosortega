/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion de las variables
        
        String valor1;
        String valor2;
        String valor3;
        double m;
        
        //Creacion del scanner para poder ingresar los valores por teclado

        Scanner scan = new Scanner(System.in);
        
        //Ingreso de los valores por teclado
        
        System.out.println("Por favor ingrese el valor de x:\n");
        valor1 = scan.nextLine();
        System.out.println("Por favor ingrese el valor de y:\n");
        valor2 = scan.nextLine();
        System.out.println("Por favor ingrese el valor de z:\n");
        valor3 = scan.nextLine();
        
        //Hacer un casting de String a double
        
        double x = Double.parseDouble(valor1);
        double y = Double.parseDouble(valor2);
        double z = Double.parseDouble(valor3);
        
        //Operacion para poder calcular el valor de m
        
        m = (x+y/z)/(x-y/z);
        
        //Mostrar en pantalla las 3 variables y el resultado m
        
        System.out.printf("El valor de m en base a las variables: \nx = %.1f"
                + "\n\ty = %.1f \n\t\tz = %.1f \nda como resultado:"
                + "\n\t\t\tm = %.1f",x,y,z,m);
        
        
        
        
        
        
    }
    
}
