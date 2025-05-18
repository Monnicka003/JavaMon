
import java.util.Optional;
public class Factura {

    private double monto;
    private String descripcion;
    private Optional <String> rfc;

    Factura (double monto, String descripcion, String rfc){
        this.monto=monto;
        this.descripcion=descripcion;

        this.rfc = Optional.ofNullable(rfc);

    }
    public String getResu(){
        String resumen="****Factura generada**** \n";
        resumen=resumen+"descripcion  \n"+descripcion ;
        resumen+="\n Monto$\n"+monto;
        resumen+="\nRFC\n"+rfc.orElse("NO PROPORCIONADO");
        return resumen;




    }






}
