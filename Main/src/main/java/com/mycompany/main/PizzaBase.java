/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author braya
 */
public class PizzaBase implements Pizza {
    @Override
    public String getDescripcion() {
        return "Masa con salsa";
    }

    @Override
    public double getCosto() {
        return 5.0;
    }
}

