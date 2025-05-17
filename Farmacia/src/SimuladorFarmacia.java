public class SimuladorFarmacia {

    public static void main(String[] args) {

        String medicamento=  " Amoxixilina";
        // Precios unitarios
        double precioMedi = 120.00;
       

        // Cantidades
        int cantidadMedi = 5;


        // Cálculo del total (con prioridad de operadores)
        double total = (precioMedi * cantidadMedi);

        // Descuento si el total supera $150
        boolean aplicaDescuento = total > 500;

        // Asignación del descuento (10%)
        double descuento = aplicaDescuento ? total * 0.15: 0;

        // Cálculo final
        double totalFinal = total - descuento;

        // Salida formateada
        System.out.println("Medicamento"+medicamento);
        System.out.println("Total de la compra: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}
