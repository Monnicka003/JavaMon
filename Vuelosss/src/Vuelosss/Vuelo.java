package Vuelosss;

public class Vuelo {
    final String codigo;       // atributo constante
    String destino;
    String horaSalida;
    Pasajero asientoRes;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoRes = null;
    }


    public boolean reservarAsiento(Pasajero pasje) {
        if (asientoRes == null) {
            asientoRes = pasje;
            return true;
        } else {
            return false;
        }
    }


    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }


    public void cancelarReserva() {
        asientoRes = null;
    }


    public String obtenerItinerario() {
        String info = "Itinerario:";
        info += "Código: " + codigo ;
        info += "Destino: " + destino ;
        info += "Salida: " + horaSalida ;
        if (asientoRes != null) {
            info += "Pasajero: " + asientoRes.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}