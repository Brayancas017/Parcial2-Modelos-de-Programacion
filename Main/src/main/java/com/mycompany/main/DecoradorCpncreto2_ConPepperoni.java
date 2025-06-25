/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author braya
 */
public class DecoradorCpncreto2_ConPepperoni extends IngredienteDecorator {
    
    public DecoradorCpncreto2_ConPepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Pepperoni";
    }

    @Override
    public double getCosto() {
        return pizza.getCosto() + 2.0;
    }
 
}
