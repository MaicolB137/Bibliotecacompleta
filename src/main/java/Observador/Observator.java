package Observador;

/**
 *
 * @author Alejandro Bernal Garnica
 */
public class Observator implements Observador {
    
    @Override
    public void actualizar() {
        System.out.println("se ha extendido el plazo del prestamo por 15 dias");
        
    }
   
}
