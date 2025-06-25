/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexiondb;

/**
 *
 * @author braya
 */
public class ConexionDB {

    public static void main(String[] args) {
        
        ConexionGlobalDB conexion1 = ConexionGlobalDB.getInstancia();
        ConexionGlobalDB conexion2 = ConexionGlobalDB.getInstancia();

        
        conexion1.consultar("Select * From usuarios");
        conexion2.consultar("Select * From productos");
        
        //verificar que instancias son iguales
        System.out.println(conexion1 = conexion2);
    }
        
}
