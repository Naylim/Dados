package dados;
import java.util.*;

public class Dados {
    int lados;
    
    public Dados(){
        lados=6;
    }
    public Dados(int lados){
        this.lados=lados;
    }
    
    public int lanzar(){
        int ladoA;
        Random ran=new Random();
        ladoA=ran.nextInt(lados)+1;
        return ladoA;
    }  
    
    public int getLados(){return lados;}
    public void setLados(int lados){this.lados=lados;}
    
    public void mayor(){
        int suma1=0, suma2=0, cara1, cara2;
        for (int a = 0; a < 5; a++){
            cara1 =  lanzar();
            suma1=suma1+cara1;
            System.out.println("Jugador 1:" + cara1);
            cara2 = lanzar();
            suma2=suma2+cara2;
            System.out.println("Jugador 2:" + cara2);
            if (cara1 > cara2) {
                System.out.println("La cara mas alta es:" + cara1);
            } else if (cara2 > cara1) {
                System.out.println("La cara mas alta es:" + cara2);
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
