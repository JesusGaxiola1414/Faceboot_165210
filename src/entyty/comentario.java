package entyty;

import java.util.Date;

/**
 *
 * @author RayoMC
 */
public class comentario {
//Crear variables   
    String usuario;
    Date fecha;
    String contenido;
    
//Constructor por defecto
    public comentario() {
    }
//Devuelve variable Usuario
    public String getUsuario() {
        return usuario;
    }
//Asigna variable Usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
//Devuelve variable Fecha
    public Date getFecha() {
        return fecha;
    }
//Asigna variable Fecha
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
//Devuelve variable Contenido
    public String getContenido() {
        return contenido;
    }
//Asigna variable Contenido 
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
}
