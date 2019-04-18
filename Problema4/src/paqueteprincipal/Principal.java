/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;

import paquete1. *;
import paquete2. *;
import paquete3. *;

/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        
        /*
        Uso del ? para que en caso de que la variable edad cumpla con la 
        condicion, la variable resultado tomaria la opcion de la izquierda
        y en caso contrario que la variable edad no cumpla con la 
        condicion, la variable resultado tomaria la opcion de la derecha
        */
        
        String resultado = MiClase1.edad >=18 ? "mayor de edad" :
                "menor de edad";
        
        /*
        Mostrar en pantalla el nombre, apellido, edad y si es mayor o menor de 
        edad
        */
        
        System.out.printf("Nombre: \n\t%s \nApellido: \n\t%s \nEdad: \n\t%d"
                + " y %s",MiClase2.nombre,MiClase3.apellido,MiClase1.edad,
                resultado);
    }
    
}
