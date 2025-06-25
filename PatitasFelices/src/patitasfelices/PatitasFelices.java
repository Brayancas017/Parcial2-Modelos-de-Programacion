/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patitasfelices;

/**
 *
 * @author estudiantes
 */
public class PatitasFelices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota perro = new Perro();  

        perro = new AccesoriosDecorator(perro);          // + traje
        perro = new EntrenamientoBasicoDecorator(perro); //  entrenamiento
        perro = new VacunaDecorator(perro);              //  salud

        System.out.println(perro.getDescripcion());
        System.out.println("Costo de adopcion: " + perro.getCostoAdopcion());
        
        Mascota gato = new Gato();  

        gato = new EsterilizacionDecorator(gato);         // esterilizacioin
        gato = new MicroChipDecorator(gato); //  chip
        gato = new VacunaDecorator(gato);              // salud

        System.out.println(gato.getDescripcion());
        System.out.println("Costo de adopcion: " + gato.getCostoAdopcion());
        
        Mascota conejo = new Conejo();  

        conejo = new EsterilizacionDecorator(conejo);         // esterilizacioin
        conejo = new MicroChipDecorator(conejo); //  chip
        conejo = new VacunaDecorator(conejo);              // salud
        conejo = new AccesoriosDecorator(conejo);          // + traje


        System.out.println(conejo.getDescripcion());
        System.out.println("Costo de adopcion: " + conejo.getCostoAdopcion());
        
    }
    
}
