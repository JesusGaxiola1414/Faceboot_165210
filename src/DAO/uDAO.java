package DAO;

import entyty.usuario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author RayoMC
 */
public class uDAO  {

            private MongoCollection<Document> usuari;

    public uDAO(MongoCollection<Document> users) {
        this.usuari = users;
    }

   // Crea una lista de usuarios a partir de cada documento
    public List<usuario> eTOD() {
        List<usuario> result = new ArrayList<>();
            for (Document doc : usuari.find()) {
                 usuario user = new usuario();
                 user.setNombre(doc.getString("Nombre"));
                 user.setNomUsuario(doc.getString("Nombre Usuario"));
                 user.setContraseña(doc.getString("Contraseña"));
                 user.setEdad(doc.getInteger("Edad"));
                 user.setSexo(doc.getString("Sexo"));
                 user.setFechaNazi(doc.getDate("Fecha Nacimiento"));
                 user.setGusMusica(doc.getList("Gustos Musicales", 
                                               String.class));
                 user.setGusPeli(doc.getList("Gusto de Pelicula", 
                                               String.class));
                       result.add(user);
              }
                           return result;
    }

   // Buscar Usuario por username, crear un objeto usuario y regresarlo
     public usuario eUSUA(String username) {
               Document docc = usuari.find(Filters.eq("Nombre Usurario",
                                                   username)).first();
                     usuario user = new usuario();
                     user.setNombre(docc.getString("Nombre"));
                     user.setNomUsuario(docc.getString("Nombre Usuario"));
                     user.setContraseña(docc.getString("Contraseña"));
                     user.setEdad(docc.getInteger("Edad"));
                     user.setSexo(docc.getString("Sexo"));
                     user.setFechaNazi(docc.getDate("Fecha Nacimiento"));
                     user.setGusMusica(docc.getList("Gustos Musicales", 
                                                    String.class));
                     user.setGusPeli(docc.getList("Gusto de Pelicula", 
                                                    String.class));
                         return user;
    }

    // Agregar un usuario a la lista de documents a partir del usuario pasado
       public void agregUS(usuario usuario) {
              Document document = new Document()
                    .append("Nombre", usuario.getNombre())
                    .append("Nombre Usuario", usuario.getNomUsuario())
                    .append("Contraseña", usuario.getContraseña())
                    .append("Edad", usuario.getEdad())
                    .append("Sexo", usuario.getSexo())
                    .append("Fecha Nacimiento", usuario.getFechaNazi())
                    .append("Gustos Musicales", usuario.getGusMusica())
                    .append("Gusto de Pelicula", usuario.getGusPeli());
                         usuari.insertOne(document);
    }

    // Eliminar usuario con el username del usuario pasado
      public void Borrar(usuario usuario) {
         DeleteResult delete = usuari.deleteOne(Filters.eq("Nombre Usuario", usuario.getNomUsuario()));
    }

   // Actualizar datos del usuario
      public void Actualizar(usuario usuario) {
         UpdateResult resultado;
            resultado = usuari.updateOne(
                Filters.eq("Nombre Usuario", usuario.getNomUsuario()),
                   Updates.set("Nombre", usuario.getNombre()));
            resultado = usuari.updateOne(
                Filters.eq("Nombre Usuario", usuario.getNomUsuario()),
                   Updates.set("Contraseña", usuario.getContraseña()));
            resultado = usuari.updateOne(
                Filters.eq("Nombre Usuario", usuario.getNomUsuario()),
                   Updates.set("Gustos Musicales", usuario.getGusMusica()));
            resultado = usuari.updateOne(
                Filters.eq("Nombre Usuario", usuario.getNomUsuario()),
                   Updates.set("Gusto de las Pelicula", usuario.getGusPeli()));

    }
}
