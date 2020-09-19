
import java.awt.Color;

public class Comic extends Articulo {

    private String Descripcion;
    private int Volumen, Estado;

    public Comic() {
        super();
    }

    public Comic(String Descripcion, int Volumen, int Estado, String Titulo, String Categoria, String Editorial, int Tamano, int Puntuacion, Color Colorr) {
        super(Titulo, Categoria, Editorial, Tamano, Puntuacion, Colorr);
        this.Descripcion = Descripcion;
        this.Volumen = Volumen;
        this.Estado = Estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getVolumen() {
        return Volumen;
    }

    public void setVolumen(int Volumen) {
        this.Volumen = Volumen;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
