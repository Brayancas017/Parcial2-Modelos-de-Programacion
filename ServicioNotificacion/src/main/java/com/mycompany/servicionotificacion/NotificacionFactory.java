/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicionotificacion;

/**
 *
 * @author estudiantes
 */
public class NotificacionFactory {
    
    public Notificacion crearNotificacion (String tipo){
        Notificacion notificacion = null;

        if (tipo.equals("email")){
            notificacion = new NotificacionEmail();
            
        }else if(tipo.equals("sms")){
            notificacion = new NotificacionSms();
            
        }else if(tipo.equals("whatsapp")){
            notificacion = new NotificacionWhatsapp();
        } 

        return notificacion;
    }
    
}
