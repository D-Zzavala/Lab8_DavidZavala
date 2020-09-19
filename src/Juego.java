
import java.awt.Color;

public class Juego extends Articulo {

    private int Edicion;
    private String Casa, Pais, Ingreso;

    public Juego() {
        super();
    }

    public Juego(String Ingreso,int Edicion, String Casa, String Pais, String Titulo, String Categoria, String Editorial, int Tamano, int Puntuacion, Color Colorr) {
        super(Titulo, Categoria, Editorial, Tamano, Puntuacion, Colorr);
        this.Ingreso = Ingreso;
        this.Edicion = Edicion;
        this.Casa = Casa;
        this.Pais = Pais;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    public String getCasa() {
        return Casa;
    }

    public void setCasa(String Casa) {
        this.Casa = Casa;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
