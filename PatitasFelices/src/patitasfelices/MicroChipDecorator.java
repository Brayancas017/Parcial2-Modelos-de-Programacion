/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitasfelices;

/**
 *
 * @author estudiantes
 */
public class MicroChipDecorator extends ServicioDecorator{
    
    public MicroChipDecorator(Mascota mascota) {
        super(mascota);
    }
    
    @Override
    public String getDescripcion(){
        return mascota.getDescripcion() + "Gps e identificador incorporado";
    }
    
    @Override
    public double getCostoAdopcion(){
        return mascota.getCostoAdopcion() + 10;
    }
    
}
