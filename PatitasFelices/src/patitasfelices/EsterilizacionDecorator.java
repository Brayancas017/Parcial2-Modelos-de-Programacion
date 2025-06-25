/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitasfelices;

/**
 *
 * @author estudiantes
 */
public class EsterilizacionDecorator extends ServicioDecorator {
    
    public EsterilizacionDecorator(Mascota mascota) {
        super(mascota);
    }
    
    @Override
    public String getDescripcion(){
        return mascota.getDescripcion() + "Esterilizacion completa";
    }
    
    @Override
    public double getCostoAdopcion(){
        return mascota.getCostoAdopcion() + 3;
    }
    
    
    
}
