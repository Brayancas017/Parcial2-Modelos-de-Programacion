/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author braya
 */
public class Main {

    public static void main(String[] args) {
        Pizza miPizza = new PizzaBase();
        miPizza = new DecoradorConcreto1_ConQueso(miPizza);
        miPizza = new DecoradorCpncreto2_ConPepperoni(miPizza);
        

        System.out.println("Descripción: " + miPizza.getDescripcion());
        System.out.println("Costo: $" + miPizza.getCosto());
    }
}
