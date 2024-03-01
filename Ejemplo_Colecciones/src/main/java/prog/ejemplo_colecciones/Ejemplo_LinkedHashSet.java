/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplo_colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author larapresa
 */
public class Ejemplo_LinkedHashSet {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        //adding elements to LinkedHashSet
        set.add("Do"); //first added element
        set.add("Re");
        set.add("Mi");
        set.add("Fa");
        set.add("Sol");
        set.add("La");//last added element

        // Observa que se imprime en el mismo orden que se insertaron
        System.out.println("LINKEDHASHSET mantiene el orden de inserción");
        System.out.println(set);

        // Si fuera un HASHSET
        Set<String> set2 = new HashSet<>();
        //adding elements to dHashSet
        set2.add("Do"); //first added element
        set2.add("Re");
        set2.add("Mi");
        set2.add("Fa");
        set2.add("Sol");
        set2.add("La");//last added element

        // Observa que NO se mantiene el orden de inserción
        System.out.println("HASHSET NO mantiene el orden de inserción");
        System.out.println(set2);

    }

}
