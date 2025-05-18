package DeclaracionImp;

import java.util.Objects;

public class CuentaFiscal {

    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("❌ El saldo no puede ser negativo. Se asigna 0.");
            this.saldoDisponible = 0;
        }
    }

    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
return saldoDisponible;
    }

   public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }



        public void MostrarCuenta() {
        System.out.println("Cuanta registrada con su RFC"+saldoDisponible);

        }

    }

