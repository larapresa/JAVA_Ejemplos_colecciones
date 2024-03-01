/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplo_colecciones;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author larapresa
 */
public class Ejemplo_LinkedList {

    public static void main(String[] args) {

        // Crear una LinkedList
        LinkedList<String> alumnado = new LinkedList<>();

        // Agregar elementos a la LinkedList
        alumnado.add("Lucia");
        alumnado.add("Juan");
        alumnado.add("Marta");
        alumnado.add("Nuria");

        // Imprimir el tamaño de la LinkedList
        System.out.println("Tamaño de la LinkedList: " + alumnado.size());

        // Mostrar todos los elementos de la LinkedList
        System.out.println("Elementos de la LinkedList:");
        for (String alumno : alumnado) {
            System.out.println(alumno);
        }

        // Verificar si un elemento específico está presente en la LinkedList
        String buscarAlumno = "Marta";
        if (alumnado.contains(buscarAlumno)) {
            System.out.println("El alumno " + buscarAlumno + " está en la lista.");
        } else {
            System.out.println("El alumno " + buscarAlumno + " no está en la lista.");
        }

        // Obtener el índice de un elemento específico en la LinkedList
        String buscarAlumnoIndice = "Juan";
        int indice = alumnado.indexOf(buscarAlumnoIndice);
        System.out.println("El alumno " + buscarAlumnoIndice + " está en el índice " + indice);
        /**
        // Ordenar la LinkedList (no es eficiente en términos de rendimiento)
        Collections.sort(alumnado);  // Nota: No es la forma más eficiente de ordenar una LinkedList
        System.out.println("LinkedList ordenada alfabéticamente:");
        for (String alumno : alumnado) {
            System.out.println(alumno);
        }
        */
        
        // Ordenar la LinkedList de manera eficiente usando un Comparator
        alumnado.sort(Comparator.naturalOrder());
        System.out.println("LinkedList ordenada alfabéticamente:");
        for (String alumno : alumnado) {
            System.out.println(alumno);
        }

        // Eliminar un elemento específico de la LinkedList
        String eliminarAlumno = "Marta";
        alumnado.remove(eliminarAlumno);
        System.out.println("Después de eliminar a " + eliminarAlumno + ":");
        for (String alumno : alumnado) {
            System.out.println(alumno);
        }

        // Limpiar todos los elementos de la LinkedList
        alumnado.clear();
        System.out.println("Después de limpiar la LinkedList, tamaño: " + alumnado.size());
    }
}
