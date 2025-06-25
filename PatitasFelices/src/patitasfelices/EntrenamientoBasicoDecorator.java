/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitasfelices;

/**
 *
 * @author estudiantes
 */
public class EntrenamientoBasicoDecorator extends ServicioDecorator{
    
    public EntrenamientoBasicoDecorator(Mascota mascota) {
        super(mascota);
    }
    
    @Override
    public String getDescripcion() {
        String descripcion = mascota.getDescripcion();
        return descripcion.replace("Entrenamiento: No asignado", "Entrenamiento: Entrenamiento Militar");
    }
    
    @Override
    public double getCostoAdopcion() {
        return mascota.getCostoAdopcion() + 20;
    }
   
    
    
}
