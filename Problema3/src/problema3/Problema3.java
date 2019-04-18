/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String a;
        String b;
        String c;
        double promedio;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese la primera nota:\n");
        a = scan.nextLine();
        System.out.println("Por favor ingrese la segunda nota:\n");
        b = scan.nextLine();
        System.out.println("Por favor ingrese la tercera nota:\n");
        c = scan.nextLine();
        
        double nota1 = Double.parseDouble(a);
        double nota2 = Double.parseDouble(b);
        double nota3 = Double.parseDouble(c);
        
        promedio = (nota1+nota2+nota3)/3;
        
        String resultado = promedio>14 ? "Pasa el año" : "No pasa el año";
        
        System.out.printf("El resultado es: %.1f por lo tanto: "
                + "%s\n",promedio,resultado);
    }
    
}
