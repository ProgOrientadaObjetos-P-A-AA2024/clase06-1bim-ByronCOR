/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import paquete2.Calificacion;
import paquete2.Profesor;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        Profesor profesor1 = new Profesor("Franco", "nombramiento");
        Profesor profesor2 = new Profesor("Richard", "contrato");
        
        // crear un arreglo de objetos de tipo Calificacion
        ArrayList<Calificacion> calificaciones = new ArrayList<>();
        
        Calificacion c = new Calificacion(10, "Computación", profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica", profesor2);
        
        calificaciones.add(c);
        calificaciones.add(c2);
        
        for (int i = 0; i < calificaciones.size(); i++) {
            Calificacion objetoCalificacion = calificaciones.get(i);
            System.out.printf("%s - %.2f - Profesor(%s)\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre());
        }
        
    }
    
}
