/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplo_colecciones;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author larapresa
 */
public class Ejemplo_HashSet2 {
    
   public static void main(String[] args) {

       
        HashSet<Integer> conjunto = new HashSet();
        Scanner teclado = new Scanner(System.in);
        int n;
         // Empleando un estructura iterativa para añadir datos 
         // pedidos por teclado
        do {
            System.out.println("Introduce el elemento " + (conjunto.size() + 1) + ":");
            n = teclado.nextInt();
            if (!conjunto.add(n)) {
                System.out.println("Número ya en la lista. Debes introducir otro.");
            }
        } while (conjunto.size() < 5);
        // Calcular la suma
        Integer suma = 0;
        // ejemplo de bucle FOR EACH
        for (Integer i : conjunto) {
            suma = suma + i;
            System.out.println("Valor a sumar:" + i);
        }
        System.out.println("La suma del conjunto es:" + suma);
    }
    
}
