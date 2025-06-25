/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitasfelices;

/**
 *
 * @author estudiantes
 */
public class Gato implements Mascota{

    double adopcion = 3;
    String entrenamiento;
    String salud;
    
    
    @Override
    public String getDescripcion() {
        return "Gato [Adopción: " + adopcion + 
               ", Entrenamiento: " + (entrenamiento != null ? entrenamiento : "No asignado") +
               ", Salud: " + (salud != null ? salud : "No asignada") + "]";
    }

    @Override
    public double getCostoAdopcion() {
        return adopcion;
    }
    
}
