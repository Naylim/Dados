package dados;

/**
 * Clase principal para el proyecto dados
 * @author Naylim Dorame
 * @author Jonathan Herrera
 */
public class Main {
    public static void main(String[] args) {
        Dado d = new Dado(6);
        
        System.out.println("Dado de " + d.getLados() + " caras-----------------------------\n");
	Juego.comenzar(d);
        d.setLados(9);
        System.out.println("\nDado de " + d.getLados() + " caras-----------------------------\n");
	Juego.comenzar(d);
    }
}