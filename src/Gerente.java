public class Gerente extends Persona{
    
    private String Usuario, Contrasena, Cargo;

    public Gerente() {
    super();
    }

    public Gerente(String Usuario, String Contrasena, String Cargo, String Nombre, String Sexo, String EstadoC, int ID, int Edad, double Peso, double Altura) {
        super(Nombre, Sexo, EstadoC, ID, Edad, Peso, Altura);
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Cargo = Cargo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
