/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexiondb;

/**
 *
 * @author braya
 */
public class ConexionGlobalDB {
    private static ConexionGlobalDB instancia;

    // Constructor privado para evitar instanciación externa
    private ConexionGlobalDB() {
        System.out.println("Conectando a la base de datos...");
    }

    // Método de acceso público
    public static ConexionGlobalDB getInstancia() {
        if (instancia == null) {
            instancia = new ConexionGlobalDB();
        }
        return instancia;
    }

    public void consultar(String sql) {
        System.out.println("Ejecutando consulta: " + sql);
    }
}
