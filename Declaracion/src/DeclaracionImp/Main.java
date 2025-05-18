package DeclaracionImp;

public class Main{

    public static  void main (String[]args){
        DeclaracionImpuestos declaracion1=new DeclaracionImpuestos("888ABC",3000.0);
        CuentaFiscal cuenta =new CuentaFiscal("888ABC",2000.0);
        System.out.println ("Declaracion enviada"+ declaracion1.rfcContribuyente() +declaracion1.montoDeclarado());
        cuenta.MostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion1);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);



    }





}