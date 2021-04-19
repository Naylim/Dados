package dados;
import java.util.Random;

/**
 * Clase que simula el comportamiento de un dado
 * @author Naylim Dorame
 * @author Jonathan Herrera
 */
public class Dados {
    private int lados;
    
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
}
