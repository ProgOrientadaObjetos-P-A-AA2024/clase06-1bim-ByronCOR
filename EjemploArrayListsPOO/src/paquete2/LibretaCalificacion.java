/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class LibretaCalificacion {
    
    private String estudiante;
    private double promedio;
    private String promedioCualitativo;
    
    private ArrayList<Calificacion> calificaciones; 
   
    
    public LibretaCalificacion(String n, ArrayList<Calificacion> c){
        estudiante = n;
        calificaciones = c;
    }
    
    public void establecerEstudiante(String n){
        estudiante = n;
    }
    
    public void establecerPromedio(){
        double suma = 0;
        
        for (int i = 0; i < obtenerCalificaciones().size(); i++) {
            suma = suma + obtenerCalificaciones().get(i).obtenerNota();
            
        }
        
        promedio = suma/obtenerCalificaciones().size();
    }
    
    public void establecerPromedioCualitativo(){
        if((obtenerPromedio()>=0)&&(obtenerPromedio()<=3.09)){
            promedioCualitativo = "Regular";
        }else{
            if((obtenerPromedio()>=3.1)&&(obtenerPromedio()<=5.09)){
                promedioCualitativo = "Insuficiente";
            }else{
                if((obtenerPromedio()>=5.1)&&(obtenerPromedio()<=7.09)){
                    promedioCualitativo = "Bueno";
                }else{
                    if((obtenerPromedio()>=7.1)&&(obtenerPromedio()<=9.09)){
                        promedioCualitativo = "Muy bueno";
                    }else{
                        if((obtenerPromedio()>=9.1)&&(obtenerPromedio()<=10)){
                            promedioCualitativo = "Sobresaliente";
                        }else{
                            promedioCualitativo = "Sin rango";
                        }
                    }
                }
            }
        }
    }
    
    public void establecerCalificaciones(ArrayList<Calificacion>  n){
        calificaciones = n;
    }
    
    public String obtenerEstudiante(){
        return estudiante;
    }
    
    public double obtenerPromedio(){
        return promedio;
    }
    
    public String obtenerPromedioCualitativo(){
        return promedioCualitativo;
    }
    
    public ArrayList<Calificacion> obtenerCalificaciones(){
        return calificaciones;
    }
    
    @Override
    public String toString(){
        /*
        Libreta de Calificaciones
        Nombre: Roger Williams
        Calificaciones:
            Matemáticas [8] - Rolando Elizalde - contratado 1
            Ciencias Naturales [10] - Ana Garcia - contratado 2
            Literatura [9.2] - Marco Romero - contratado 1
        
        Promedio calificaciones: 9.07
        Promedio cuantitativo: Muy bueno
        
        */
        
               
        String cadena = "Libreta de Calificaciones\n";
        cadena = String.format("%sNombre: %s\nCalificaciones:\n", cadena, 
                obtenerEstudiante());
        
        for (int i = 0; i < obtenerCalificaciones().size(); i++) {
            cadena = String.format("%s\t\t%s [%.2f] - %s - %s\n", cadena, 
                    obtenerCalificaciones().get(i).obtenerNombreMateria(),
                    obtenerCalificaciones().get(i).obtenerNota(),
                    obtenerCalificaciones().get(i).obtenerProfesor().obtenerNombre(),
                    obtenerCalificaciones().get(i).obtenerProfesor().obtenerTipo());
        }
        cadena = String.format("%sPromedio calificaciones: %.2f\n"
                + "Promedio cualitativo: %s\n",  
                cadena, obtenerPromedio(), obtenerPromedioCualitativo());
        return cadena;
    }
}
