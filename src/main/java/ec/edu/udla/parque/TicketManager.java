package ec.edu.udla.parque;

/**
 * Clase encargada de gestionar el cálculo de precios de los boletos.
 */
public final class TicketManager {

    /**
     * Precio base estándar del boleto.
     */
    private static final double PRECIO_BASE = 50.0;

    /**
     * Precio especial para niños.
     */
    private static final double PRECIO_NINO = 25.0;

    /**
     * Precio especial para adultos mayores.
     */
    private static final double PRECIO_ADULTO_MAYOR = 30.0;

    /**
     * Edad máxima para ser considerado niño.
     */
    private static final int EDAD_NINO_MAX = 12;

    /**
     * Edad mínima para ser considerado adulto mayor.
     */
    private static final int EDAD_ADULTO_MAYOR_MIN = 65;

    /**
     * Multiplicador de descuento para clientes VIP (10% de descuento).
     */
    private static final double DESCUENTO_VIP = 0.9;

    /**
     * Calcula el precio final del boleto basado en la edad y membresía.
     *
     * @param edad  La edad del visitante.
     * @param esVIP Indica si el cliente tiene membresía VIP.
     * @return El precio final calculado.
     */
    public double calcularPrecio(final int edad, final boolean esVIP) {
        double precioFinal = PRECIO_BASE;

        if (edad < EDAD_NINO_MAX) {
            precioFinal = PRECIO_NINO;
        } else if (edad >= EDAD_ADULTO_MAYOR_MIN) {
            precioFinal = PRECIO_ADULTO_MAYOR;
        }

        if (esVIP) {
            precioFinal = precioFinal * DESCUENTO_VIP;
        }

        return precioFinal;
    }

    /**
     * Método de prueba para imprimir un mensaje de bienvenida.
     */
    public void metodoNoProbado() {
        System.out.println("Bienvenido al Parque de Diversiones.");
    }
}
