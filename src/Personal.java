public class Personal extends Persona{
    
    private String Ocupacion;
    private int HEntrada,HSalida,Antiguedad;
    private double Sueldo;

    public Personal() {
    super();
    }

    public Personal(String Ocupacion, int HEntrada, int HSalida, int Antiguedad, double Sueldo, String Nombre, String Sexo, String EstadoC, int ID, int Edad, double Peso, double Altura) {
        super(Nombre, Sexo, EstadoC, ID, Edad, Peso, Altura);
        this.Ocupacion = Ocupacion;
        this.HEntrada = HEntrada;
        this.HSalida = HSalida;
        this.Antiguedad = Antiguedad;
        this.Sueldo = Sueldo;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public int getHEntrada() {
        return HEntrada;
    }

    public void setHEntrada(int HEntrada) {
        this.HEntrada = HEntrada;
    }

    public int getHSalida() {
        return HSalida;
    }

    public void setHSalida(int HSalida) {
        this.HSalida = HSalida;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
