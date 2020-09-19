
import java.awt.Color;

public class Articulo {
    
    private String Titulo, Categoria, Editorial; ///La categoria es la descripcion
    private int Tamano, Puntuacion;
    private Color Colorr;

    public Articulo() {
    }

    public Articulo(String Titulo, String Categoria, String Editorial, int Tamano, int Puntuacion, Color Colorr) {
        this.Titulo = Titulo;
        this.Categoria = Categoria;
        this.Editorial = Editorial;
        this.Tamano = Tamano;
        this.Puntuacion = Puntuacion;
        this.Colorr = Colorr;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public Color getColorr() {
        return Colorr;
    }

    public void setColorr(Color Colorr) {
        this.Colorr = Colorr;
    }

    @Override
    public String toString() {
        return "Titulo: " + Titulo + ", Tamaño:" + Tamano;
    }
    
    
}
