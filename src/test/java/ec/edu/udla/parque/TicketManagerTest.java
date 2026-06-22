package ec.edu.udla.parque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketManagerTest {

    @Test
    public void testCalcularPrecioNino() {
        TicketManager manager = new TicketManager();
        // Solo probamos la ruta de los niños para mantener la cobertura baja
        assertEquals(25.0, manager.calcularPrecio(10, false));
    }
}
