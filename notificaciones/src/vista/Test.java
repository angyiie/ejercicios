package vista;

import javax.swing.JOptionPane;

import modelo.EmailNotification;
import modelo.Notification;
import modelo.PushNotification;
import modelo.SmsNotification;

public class Test {

    public static void main(String[] args) {
        // Punto 4. Arrays:
        // Se utiliza un arreglo de tipo Notification[] para almacenar
        // objetos de cualquiera de los tres tipos de notificaciones.
        Notification[] avisos = {
                
                new EmailNotification(
                        "angy@gmail.com",
                        "Aviso importante",
                        "La cuenta esta actualizada"),

                new SmsNotification(
                        "0123456789",
                        "Código 2929"),

                new PushNotification(
                        "xyz001",
                        "Nueva alerta"),

                new EmailNotification(
                        "productos@softech.com",
                        "Confirmación de compra",
                        "Su pedido ha sido procesado correctamente"),

                new SmsNotification(
                        "9876543210",
                        "Pedido Correcto")
        };


        int correos = 0;
        int sms = 0;
        int push = 0;

        String texto = "Notificaciones procesadas:\n\n";

        // Punto 6. Switch Moderno:
        // Se recorre el arreglo utilizando un switch con Pattern Matching
        // de Java 21 para identificar cada tipo de notificación.
        // No se utilizan if-else ni instanceof.
        for (Notification aviso : avisos) {

            switch (aviso) {

                case EmailNotification correo -> {
                    correos++;
                    texto += "Correo: " + correo.correo() + "\n";
                }

                case SmsNotification mensaje -> {
                    sms++;
                    texto += "SMS: " + mensaje.telefono() + "\n";
                }

                case PushNotification noti -> {
                    push++;
                    texto += "Push: " + noti.token() + "\n";
                }
            }
        }


        texto += "\n====================\n";
        texto += "Correos enviados: " + correos + "\n";
        texto += "SMS enviados: " + sms + "\n";
        texto += "Push enviados: " + push + "\n";
        texto += "Total: " + avisos.length;


        JOptionPane.showMessageDialog(null, texto);
    }
}