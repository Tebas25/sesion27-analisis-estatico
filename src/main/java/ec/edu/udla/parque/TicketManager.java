package ec.edu.udla.parque;

public class TicketManager {

    // PMD detectará esto: Variable no utilizada
    private int variableInutil = 100;

    public double calcularPrecio(int edad, boolean esVIP) {
        // Checkstyle detectará esto: mal espaciado y nombre de variable poco descriptivo
        double p=50.0; 

        if (edad < 12) {
            p = 25.0;
        } else if (edad >= 65) {
            p = 30.0;
        }

        // PMD detectará esto: Bloque if vacío
        if(esVIP) {
        } else {
            p = p + 0;
        }

        return p;
    }

    // JaCoCo detectará esto: Método sin pruebas (cobertura baja)
    public void metodoNoProbado() {
        System.out.println("Bienvenido al Parque de Diversiones.");
    }
}