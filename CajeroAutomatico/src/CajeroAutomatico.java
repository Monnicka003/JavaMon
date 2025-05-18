import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String args[]) {
        int input2;
        int input3;
        double saldo = 1000.0;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Bienvenido al cajero automatico");
            System.out.println("Por favor seleccione una opcion");
            System.out.println("1.-Consultar saldo");
            System.out.println("2.-Depositar dinero");
            System.out.println("3.-Retirar");
            System.out.println("4.-Salir");


            input2 = scanner.nextInt();
          //  double nuevoSaldo= scanner.nextInt();

            //double total2=  saldo+nuevoSaldo;
           //double total5= saldo+total2;
            //double total66=0;

switch(input2){


    case 1-> {

        System.out.println("Su saldo es de "+saldo);

    }
    case 2->{
        System.out.println("ingrese el monto a depositar");
           double  nuevoSaldo=scanner.nextInt();
       System.out.println("se ha depositado $" +nuevoSaldo +" a su cuenta");
        saldo= nuevoSaldo+ saldo;
    }
    case 3-> {
        System.out.println("Agregar la cantidad que deseas retirar");
        double retirarSaldo = scanner.nextInt();


        if (retirarSaldo <= 0) {
            System.out.println("por favor ingrese una cantidad mayor a 0");

    }  else if  (retirarSaldo>saldo){
            System.out.println("Saldo no suficiente "  +saldo);

        }
            else{
                saldo-=retirarSaldo;
            System.out.println("retiro realizado con exito su saldo actual es "+saldo);
        }

                 //(retirarSaldo>saldo) {
               // System.out.println("no tiene saldo suficiente");
              //  else{
                   // saldo = saldo - retirarSaldo;

            }
        }



        } while (input2 != 4);
scanner.close();

    }



}