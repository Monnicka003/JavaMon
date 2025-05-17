package Vuelosss;

public class Principal {
    public static void main(String[] args) {

        Pasajero pasajero = new Pasajero("Monica", "PEP0567");


        Vuelo vuelo = new Vuelo("AMX221", "Tailandia", "14:30");

        // Reservar asiento

         boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Realizamos una nueva reservacion
        vuelo.reservarAsiento("Mario Gonzalez", "P987654");
        System.out.println(vuelo.obtenerItinerario());
    }
}