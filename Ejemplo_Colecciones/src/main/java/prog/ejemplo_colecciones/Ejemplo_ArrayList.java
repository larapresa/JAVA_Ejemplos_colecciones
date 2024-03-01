/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplo_colecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author larapresa
 */
public class Ejemplo_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> alumnado = new ArrayList<>(2);// creamos un arrayList de tamaño 2
        System.out.println("Tamaño del ArrayList al inicio: " + alumnado.size());

        // Fijaos que como es un ArrayList podemos aumentar 
        // su tamaño de maner dinámica. Estamos guardando 4 alumnos/as. 
        alumnado.add("Lucia");
        alumnado.add("Juan");
        alumnado.add("Marta");
        alumnado.add("Nuria");

        // Imprimir el tamaño del ArrayList
        System.out.println("Tamaño del ArrayList después de almacenar 4 alumnos/as: " + alumnado.size());

        // Mostrar todos los elementos del ArrayList
        System.out.println("Elementos del ArrayList:");
        for (String alumno : alumnado) {
            System.out.println(alumno);
        }

        // Verificar si un elemento específico está presente en el ArrayList
        String buscarAlumno = "Marta";
        if (alumnado.contains(buscarAlumno)) {
            System.out.println("El alumno " + buscarAlumno + " está en la lista.");
        } else {
            System.out.println("El alumno " + buscarAlumno + " no está en la lista.");
        }

        // Obtener el índice de un elemento específico en el ArrayList
        String buscarAlumnoIndice = "Juan";
        int indice = alumnado.indexOf(buscarAlumnoIndice);
        System.out.println("El alumno " + buscarAlumnoIndice + " está en el índice " + indice);

        // Ordenar el ArrayList en orden alfabético
        Collections.sort(alumnado);
        System.out.println("ArrayList ordenado alfabéticamente:");
        for (String alumno : alumnado) {
            System.out.println(alumno);
        }

        // Eliminar un elemento específico del ArrayList
        String eliminarAlumno = "Marta";
        alumnado.remove(eliminarAlumno);
        System.out.println("Después de eliminar a " + eliminarAlumno + ":");
        for (String alumno : alumnado) {
            System.out.println(alumno);
        }

        // Limpiar todos los elementos del ArrayList
        alumnado.clear();
        System.out.println("Después de limpiar el ArrayList, tamaño: " + alumnado.size());
    }
}
