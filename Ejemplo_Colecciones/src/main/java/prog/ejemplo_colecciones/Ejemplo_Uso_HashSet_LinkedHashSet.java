/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplo_colecciones;

import java.util.*;

/**
 *
 * @author larapresa
 * 
 * Tanto HashSet como LinkedHashSet nos permiten eliminar duplicados 
 * de una array de manera rápida
 */
public class Ejemplo_Uso_HashSet_LinkedHashSet {

    public static void main(String[] args) {
        String[] arrayWithDuplicates = {"50001", "50002", "50003", "50001", "50004", "50002", "50005", "50006", "50007"};

        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arrayWithDuplicates));
        List<String> listWithoutDuplicates = new ArrayList<>(linkedHashSet);
        
        System.out.println("array con duplicados = " + Arrays.toString(arrayWithDuplicates));
        
        System.out.println("array sin duplicados = " + listWithoutDuplicates);

        // -------------------------------------------------------------------------
        // con Hash Set no sabemos qué orden van a tener los elementos
        Set<String> regularHashSet = new HashSet<>(Arrays.asList(arrayWithDuplicates));

        // Se han eliminado los duplicados y nos los muestra en orden de inserción
        System.out.println("linkedHashSet = " + linkedHashSet);
       // Se han eliminado los duplicados pero NO los muestra en orden de inserción
        System.out.println("regularHashSet = " + regularHashSet);
    }
}
