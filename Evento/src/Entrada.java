
public class Entrada {
String nombreEvento;
double precio_entrada;

public Entrada(String nombreEvento, double precio_entrada){
    this.nombreEvento=nombreEvento;
    this.precio_entrada=precio_entrada;

}
public void mostrarInformacion(){
    System.out.println("Evento:"+ nombreEvento+ "|"+"Precio $"+precio_entrada);
}
}
