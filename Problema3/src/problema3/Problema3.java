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
        
        //Declaracion de las variables
    
        String a;
        String b;
        String c;
        double promedio;
        
        //Creacion del scanner para ingresar los datos por teclado
        
        Scanner scan = new Scanner(System.in);
        
        //Ingreso de las notas
        
        System.out.println("Por favor ingrese la primera nota:\n");
        a = scan.nextLine();
        System.out.println("Por favor ingrese la segunda nota:\n");
        b = scan.nextLine();
        System.out.println("Por favor ingrese la tercera nota:\n");
        c = scan.nextLine();
        
        //Casting de String a double
        
        double nota1 = Double.parseDouble(a);
        double nota2 = Double.parseDouble(b);
        double nota3 = Double.parseDouble(c);
        
        //Operacion para calcular el promedio de las 3 notas
        
        promedio = (nota1+nota2+nota3)/3;
        
        /*
        Uso del ? para que en caso de que la variable promedio cumpla con la 
        condicion, la variable resultado tomaria la opcion de la izquierda
        y en caso contrario que la variable promedio no cumpla con la 
        condicion, la variable resultado tomaria la opcion de la derecha
        */
        
        String resultado = promedio>14 ? "Pasa el año" : "No pasa el año";
        
        //Mostrar el resultado del promedio y el mensaje de si pasa el año o no
        
        System.out.printf("El resultado es: %.1f por lo tanto: "
                + "%s\n",promedio,resultado);
    }
    
}
