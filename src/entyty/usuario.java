package entyty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author RayoMC
 */
public class usuario {
 //Crear variables  
    String NomUsuario;
    String Contraseña;
    String Nombre;
    int Edad;
    String Sexo;
    Date FechaNacimiento;
    List<String> GustoMusica = new ArrayList<>();
    List<String> GustoPelilicula = new ArrayList<>();
    List<post> comentarios = new ArrayList<>();
//Constructor por defecto
    public usuario() {
    }
 //Constructor que inicializa la variable
    public usuario(String NomUsuario, String Contraseña, String Nombre, int Edad, 
                   String Sexo, Date FechaNacimiento, List<String> GustoMusica, List<String> GusPeli) {
        this.NomUsuario = NomUsuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.FechaNacimiento = FechaNacimiento;
        this.GustoMusica = GustoMusica;
        this.GustoPelilicula = GusPeli;
    }
    
//Devuelve variable NomUsuario
    public String getNomUsuario() {
        return NomUsuario;
    }
//Asigna variable NomUsuario
    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }
//Devuelve variable Contraseña
    public String getContraseña() {
        return Contraseña;
    }
//Asigna variable contraseña
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    //Devuelve variable Nombre
    public String getNombre() {
        return Nombre;
    }
//Asigna variable Nombre
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }   
 //Devuelve variable Edad
    public int getEdad() {
        return Edad;
    }
//Asigna variable Edad
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    //Devuelve variable Sexo
    public String getSexo() {
        return Sexo;
    }
//Asigna variable Sexo
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
//Devuelve variable FechaNazi
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }
//Asigna variable FechaNazi
    public void setFechaNacimiento(Date FechaNazi) {
        this.FechaNacimiento = FechaNazi;
    }
    //Devuelve variable GusMusica
    public List<String> getGustoMusica() {
        return GustoMusica;
    }
//Asigna variable GusMusica
    public void setGustoMusica(List<String> GusMusica) {
        this.GustoMusica = GusMusica;
    }
    //Devuelve variable GusPeli
    public List<String> getGusPeli() {
        return GustoPelilicula;
    }
//Asigna variable GusPeli
    public void setGusPeli(List<String> GusPeli) {
        this.GustoPelilicula = GusPeli;
    }    
//Devuelve variable Contraseña
    public List<post> getComentarios() {
        return comentarios;
    }
//Asigna variable Comentarios
    public void setComentarios(List<post> comentarios) {
        this.comentarios = comentarios;
    }  
}
