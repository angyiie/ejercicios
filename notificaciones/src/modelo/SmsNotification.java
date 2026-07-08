
package modelo;
// Punto 1. Records:
// Se utiliza un record para representar una notificación SMS.
// Al ser un record mantiene la inmutabilidad del objeto.
public record SmsNotification(
        String telefono,
        String mensaje) implements Notification {
    
    // Punto 2. Constructor Compacto:
    // Se validan los datos del SMS antes de crear la instancia.
    public SmsNotification {

        if (telefono == null || telefono.length() != 10) {
            throw new IllegalArgumentException(
                    "El teléfono debe tener 10 números");
        }
    }
}
