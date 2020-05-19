package entyty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author RayoMC
 */
public class post {
    String Usuario;
    String Cont;
    Date Fecha;
    List<String> Tag = new ArrayList<>();
    List<comentario> Comentarios;
    
//Constructor por defecto  
    public post() {
    }
//Devuelve variable Usuario
    public String getUsuario() {
        return Usuario;
    }
//Asigna variable  Usuario
    public void setUsuario(String usua) {
        this.Usuario = usua;
    }
//Devuelve variable Cont
    public String getCont() {
        return Cont;
    }
 //Asigna variable Conte
    public void setConte(String Conte) {
        this.Cont = Conte;
    }
 //Devuelve variable Fecha
    public Date getFecha() {
        return Fecha;
    }
  //Asigna variable  Fecha
    public void setFecha(Date fecha) {
        this.Fecha = fecha;
    }
 //Devuelve variable Tag
     public List<String> getTag() {
        return Tag;
    }
 //Asigna variable Tag 
    public void setTag(List<String> tag) {
        this.Tag = tag;
    }
 //Devuelve variable Comentarios
    public List<comentario> getComentarios() {
        return Comentarios;
    }
 //Asigna variable Comentarios
    public void setComentarios(List<comentario> Coment) {
        this.Comentarios = Coment;
    }
}
