/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicionotificacion;

/**
 *
 * @author estudiantes
 */
public class NotificacionWhatsapp implements Notificacion{
    
     @Override
    public void CrearNotificacion() {
         System.out.println("Creando notificacion para envio por WhatsApp");
    }
    
    @Override
    public void EnviarNotificacion(String notificacion) {
        System.out.println("Notificacion whatsapp: " + notificacion);
    }
}
