package modelo;
// Punto 3. Sealed Interface:
// Se crea una interfaz sellada que será la base de todas las notificaciones.
// Con la palabra reservada sealed se limita que clases pueden implementarla:
// EmailNotification, SmsNotification y PushNotification.
public sealed interface Notification 
        permits EmailNotification, SmsNotification, PushNotification {

}

