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
        
        String valor1;
        String valor2;
        String valor3;
        double m;

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de x:\n");
        valor1 = scan.nextLine();
        System.out.println("Por favor ingrese el valor de y:\n");
        valor2 = scan.nextLine();
        System.out.println("Por favor ingrese el valor de z:\n");
        valor3 = scan.nextLine();
        
        double x = Double.parseDouble(valor1);
        double y = Double.parseDouble(valor2);
        double z = Double.parseDouble(valor3);
        
        m = (x+y/z)/(x-y/z);
        
        System.out.printf("El valor de m en base a las variables: \nx = %.1f"
                + "\n\ty = %.1f \n\t\tz = %.1f \nda como resultado:"
                + "\n\t\t\tm = %.1f",x,y,z,m);
        
        
        
        
        
        
    }
    
}
