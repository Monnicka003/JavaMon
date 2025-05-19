package UnidadEme;

public class CentralEmergencia {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Monica");
        Patrulla patrulla = new Patrulla("Patrulla", "Luis");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Carlos);

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}
