package com.mycompany.main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author braya
 */
public abstract class IngredienteDecorator implements Pizza {
    protected Pizza pizza;

    public IngredienteDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescripcion() {
        return pizza.getDescripcion();
    }

    public double getCosto() {
        return pizza.getCosto();
    }
}

