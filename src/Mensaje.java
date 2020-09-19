public class Mensaje {

    private String Texto, Emisor, Receptor;

    public Mensaje() {
    }

    public Mensaje(String Texto, String Emisor, String Receptor) {
        this.Texto = Texto;
        this.Emisor = Emisor;
        this.Receptor = Receptor;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

}
