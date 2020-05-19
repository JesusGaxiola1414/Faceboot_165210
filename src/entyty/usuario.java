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
    Date FechaNazi;
    List<String> GusMusica = new ArrayList<>();
    List<String> GusPeli = new ArrayList<>();
    List<post> comentarios = new ArrayList<>();
//Constructor por defecto
    public usuario() {
    }
 //Constructor que inicializa la variable
    public usuario(String NomUsuario, String Contraseña, String Nombre, int Edad, 
                   String Sexo, Date FechaNazi, List<String> GusMusica, List<String> GusPeli) {
        this.NomUsuario = NomUsuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.FechaNazi = FechaNazi;
        this.GusMusica = GusMusica;
        this.GusPeli = GusPeli;
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
    public Date getFechaNazi() {
        return FechaNazi;
    }
//Asigna variable FechaNazi
    public void setFechaNazi(Date FechaNazi) {
        this.FechaNazi = FechaNazi;
    }
    //Devuelve variable GusMusica
    public List<String> getGusMusica() {
        return GusMusica;
    }
//Asigna variable GusMusica
    public void setGusMusica(List<String> GusMusica) {
        this.GusMusica = GusMusica;
    }
    //Devuelve variable GusPeli
    public List<String> getGusPeli() {
        return GusPeli;
    }
//Asigna variable GusPeli
    public void setGusPeli(List<String> GusPeli) {
        this.GusPeli = GusPeli;
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
