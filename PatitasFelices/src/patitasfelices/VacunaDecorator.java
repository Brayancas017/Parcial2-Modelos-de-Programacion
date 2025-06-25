/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitasfelices;

/**
 *
 * @author estudiantes
 */
public class VacunaDecorator extends ServicioDecorator{
    
    public VacunaDecorator(Mascota mascota) {
        super(mascota);
    }
    
    @Override
    public String getDescripcion() {
        String descripcion = mascota.getDescripcion();
        return descripcion.replace("Salud: No asignada", "Salud: Vacunas al dia");
    }
    
    @Override
    public double getCostoAdopcion() {
        return mascota.getCostoAdopcion() + 6.5;
    }
    
}
