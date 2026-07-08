
package modelo;
// Punto 1. Records:
// Se utiliza un record para representar una notificación por correo electrónico.
// Los records permiten crear objetos inmutables y generan automáticamente
// métodos como constructor, equals(), hashCode() y toString().
public record EmailNotification(
        String correo,
        String asunto,
        String mensaje) implements Notification {
    // Punto 2. Constructor Compacto:
    // Se utiliza el constructor compacto del record para realizar las
    // validaciones necesarias antes de crear el objeto.
    public EmailNotification {
        if (correo == null || !correo.contains("@")) {
            throw new IllegalArgumentException("Correo incorrecto");
        }
        
        // Validación adicional para comprobar que el asunto
        // no se encuentre vacío.
        if (asunto.isEmpty()) {
            throw new IllegalArgumentException("Falta el asunto");
        }
    }
}

