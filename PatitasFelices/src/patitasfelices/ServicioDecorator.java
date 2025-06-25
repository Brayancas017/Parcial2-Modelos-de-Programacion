/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitasfelices;

/**
 *
 * @author estudiantes
 */
public abstract class ServicioDecorator implements Mascota{
    public Mascota mascota;
    
    public ServicioDecorator(Mascota mascota){
        this.mascota = mascota;
    }
    
    public String getDescripcion(){
        return mascota.getDescripcion();
    }
    
    public double getCostoAdopcion(){
        return mascota.getCostoAdopcion();
    }
    
}
