package dados;

public class Main {

    public static void main(String[] args) {
        Dados d = new Dados(6);
        
        System.out.println("Dado de " + d.getLados() + " caras-----------------------------\n");
        d.mayor();
        d.setLados(9);
        System.out.println("\nDado de " + d.getLados() + " caras-----------------------------\n");
        d.mayor();
    }
}
