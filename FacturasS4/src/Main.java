public class Main{

    public static void main(String[]args) {
        Factura factura1 = new Factura("0ABCD919", "Atanacio Ortiz", 200.00);
        Factura factura2 = new Factura("0ABCD919", "Monica Perez", 500);
        System.out.println(factura1);
        System.out.println(factura2);
        System.out.println("Las facturas son iguales?"+ factura1.equals(factura2));
    }
}