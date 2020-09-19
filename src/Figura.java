
import java.awt.Color;

public class Figura extends Articulo{

    private String Descripcion, Instrucciones, Ingreso;
    private int Time;

    public Figura() {
        super();
    }

    public Figura(String Ingreso,String Descripcion, String Instrucciones, int Time, String Titulo, String Categoria, String Editorial, int Tamano, int Puntuacion, Color Colorr) {
        super(Titulo, Categoria, Editorial, Tamano, Puntuacion, Colorr);
        this.Ingreso = Ingreso;
        this.Descripcion = Descripcion;
        this.Instrucciones = Instrucciones;
        this.Time = Time;
    }

    public String getIngreso() {
        return Ingreso;
    }

    public void setIngreso(String Ingreso) {
        this.Ingreso = Ingreso;
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getInstrucciones() {
        return Instrucciones;
    }

    public void setInstrucciones(String Instrucciones) {
        this.Instrucciones = Instrucciones;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
