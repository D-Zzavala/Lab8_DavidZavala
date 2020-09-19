
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50431
 */
public class Persona {
    
    private String Nombre,Sexo,EstadoC;
    private int ID,Edad;
    private double Peso,Altura;
    private ArrayList<Mensaje> Mails = new ArrayList();

    public Persona() {
    }

    public Persona(String Nombre, String Sexo, String EstadoC, int ID, int Edad, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.EstadoC = EstadoC;
        this.ID = ID;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoC() {
        return EstadoC;
    }

    public void setEstadoC(String EstadoC) {
        this.EstadoC = EstadoC;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public ArrayList<Mensaje> getMails() {
        return Mails;
    }

    public void setMails(ArrayList<Mensaje> Mails) {
        this.Mails = Mails;
    }

    @Override
    public String toString() {
        return Nombre + ", Edad: " + Edad;
    }
    
    
}
