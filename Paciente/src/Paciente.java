import java.util.Scanner;
public class Paciente {


    public void mostrarInformacion() {

        Scanner namePacient= new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = namePacient.nextLine();

        Scanner agePacient= new Scanner(System.in);
        System.out.println("Enter age");
        String  edadPaciente = agePacient.nextLine();

        Scanner noPacient = new Scanner(System.in);
        System.out.println("Enter No.File.");
        String nfILE = noPacient.nextLine();


        System.out.println("Username is: " + userName);
        System.out.println("Your age  is: " + edadPaciente);
        System.out.println("Username is: " + nfILE);


        /*System.out.println("Your age is: " + edadPaciente);
        System.out.println("Your No.File is" + nfILE);*/
        // Output user input// Read user input
    }

}
