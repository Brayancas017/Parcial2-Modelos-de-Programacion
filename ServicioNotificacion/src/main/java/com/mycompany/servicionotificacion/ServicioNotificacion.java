/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.servicionotificacion;

/**
 *
 * @author estudiantes
 */
public class ServicioNotificacion {

    public static void main(String[] args) {
        
        NotificacionFactory factory = new NotificacionFactory();
        
        
        
        Notificacion notificacion = factory.crearNotificacion("email");
        notificacion.EnviarNotificacion("Correo Electronico");
        
        Notificacion notificacion2 = factory.crearNotificacion("sms");
        notificacion2.EnviarNotificacion("Sms");
        
        Notificacion notificacion3 = factory.crearNotificacion("whatsapp");
        notificacion3.EnviarNotificacion("Aplicativo WhatsApp");
        
    }
}
