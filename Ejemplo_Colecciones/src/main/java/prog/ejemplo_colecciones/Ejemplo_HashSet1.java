/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.ejemplo_colecciones;

//*****************************************************************
// IMPORTAMOS LA CLASE HASHSET.
// Nos permite implementar una COLECCIÓN DE DATOS SIN DUPLICADOS
//****************************************************************+
/**
 *    HASHSET
 * 1) Almacena los elementos en una tabla hash
 * 
 * Una tabla hash perimte asociar CLAVE <--> DIRECCIÓN DE MEMORIA
 * 
 */
import java.util.HashSet; 
import java.util.Scanner;


/**
 *
 * @author larapresa
 */
public class Ejemplo_HashSet1 {

    public static void main(String[] args) {

        // Declaramos el HASHSET de números enteros
        HashSet<Integer> digits = new HashSet();
        
        // ADD Añadimos elementos
        digits.add(0); 
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);
        digits.add(5);
        digits.add(null);
        System.out.println("Todos los elementos del hashset" + digits);
        System.out.println("Tamaño de la colección " + digits.size());

        // Intentamos añadir elementos duplicados
        
        digits.add(5);
        digits.add(2);
        System.out.println("Después de intentar añadir otro 5 y otro 2: \t" + digits);

        System.out.println("\n-------Uso del método CONTAINS-------");
        // CONTAINS Check out if the following digits exist in the hashset
        System.out.println("digits.contains(0) : " + digits.contains(0));
        System.out.println("digits.contains(2) : " + digits.contains(2));
        System.out.println("digits.contains(7) : " + digits.contains(7));
        System.out.println("digits.contains(null) : " + digits.contains(null));
        
        // REMOVE Eliminamos elementos
        digits.remove(3);
        System.out.println("Todos los elementos del hashset tras la eliminación" + digits);
        
        // CLEAR Eliminamos todos los elementos
        digits.clear();
        System.out.println("Todos los elementos del hashset tras CLEAR" + digits);
        
    }

}
