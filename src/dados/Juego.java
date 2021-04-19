package dados;

/**
 * Clase que permite hacer un juego de dados
 * @author Naylim Dorame
 * @author Jonathan Herrera
 */
public class Juego {
    public static void comenzar(Dado dado){
        int suma1=0, suma2=0, cara1, cara2;
        for (int a = 0; a < 5; a++){
            cara1 = dado.lanzar();
            suma1+=cara1;
            System.out.println("Jugador 1: " + cara1);
            cara2 = dado.lanzar();
            suma2+=cara2;
            System.out.println("Jugador 2: " + cara2);
            if (cara1 > cara2) {
                System.out.println("La cara más alta es: " + cara1);
            } else if (cara2 > cara1) {
                System.out.println("La cara más alta es: " + cara2);
            } else {
                System.out.println("Las caras son iguales");
            }
        }
        System.out.println("\nJugador 1: "+suma1+" puntos");
        System.out.println("\nJugador 2: "+suma2+" puntos");
        if(suma1>suma2){
            System.out.println("Gana el jugador 1");
        }else if(suma1<suma2){
            System.out.println("Gana el jugador 2");
        }else System.out.println("Empate");
    }
}
