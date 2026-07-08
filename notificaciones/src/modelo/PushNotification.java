package modelo;
// Punto 1. Records:
// Se utiliza un record para representar una notificación Push.
// El objeto creado es inmutable.
public record PushNotification(
        String token,
        String mensaje) implements Notification {

    public PushNotification {
        
        // Regla de validación del punto 3:
        // El token del dispositivo no puede ser nulo ni estar vacío.
        if (token == null || token.equals("")) {
            throw new IllegalArgumentException(
                    "Token vacío");
        }
    }
}
