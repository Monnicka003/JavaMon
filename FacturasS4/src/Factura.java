public class Factura {
    String folio;
    String cliente;
    double total;
    Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    @Override//Sobreescribimos el metodo ToString
        public String toString () {
      return "Factura[Folio:"+folio+"cliente"+cliente+"total"+total+"]";
        }

    @Override
    public boolean equals(Object objeto1) {
        if (this == objeto1) return true;
        if (objeto1 == null || getClass() != objeto1.getClass()) return false;

        Factura otraFactura = (Factura) objeto1;
        return this.folio.equals(otraFactura.folio);
    }
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
