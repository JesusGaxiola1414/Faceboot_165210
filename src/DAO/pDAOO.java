package DAO;

import entyty.comentario;
import entyty.post;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author RayoMC
 */
public class pDAOO{

          private MongoCollection<Document> pousty;

    public pDAOO(MongoCollection<Document> pousty) {
        this.pousty = pousty;
    }
               
// Se crea un Documento con Usuario, Fecha, Contenido, Comentarios y Tag como una matriz
    private static Document GDocum(post post) {
                List<Document> comentarios = new ArrayList<>();
                    List<comentario> f = post.getComentarios();
                       if (f != null) {  for (comentario come1na : f) {
                         comentarios.add(GDocTod(come1na));
                      }
                    }
           Document documento = new Document()
                .append("Usuario", post.getUsuario())
                .append("Fecha", post.getFecha())
                .append("Contenido", post.getCont())
                .append("Comentarios", post.getComentarios())
                .append("Tag", post.getTag());
                    return documento;
    }

// Se crea un Documento con Usuario, Fecha y Contenido como una matriz
      private static Document GDocTod(comentario comentario) {
        Document documento = new Document()
                .append("Usuario", comentario.getUsuario())
                .append("Fecha", comentario.getFecha())
                .append("Contenido", comentario.getContenido());
                    return documento;
    }

 // Crear un Post a partir de la informacion del documento
      private static post DocPost(Document documento) {
          post post = new post();   
               List<comentario> comentario = new ArrayList<>();
                   List<Document> docudos = documento.getList("Comentarios", 
                                                               Document.class);
                       if (docudos != null) { for (int i = 0; i < docudos.size(); i++) {
                         comentario.add(NCome(docudos.get(i)));
                       }
                   }
           post.setUsuario(documento.getString("Usuario"));
           post.setFecha(documento.getDate("Fecha"));
           post.setConte(documento.getString("Contenido"));
           post.setComentarios(documento.getList("Comentarios", 
                                                comentario.class));
           post.setTag(documento.getList("Tags", 
                                          String.class));
               return post;
    }

 // Regresar todos los Posts en una lista
      public List<post> PTodos() {
        List<post> resultado = new ArrayList<>();
            for (Document documento : pousty.find()) {
                 resultado.add(DocPost(documento));
               }
                   return resultado;
    }
 //Crea un comentario a base de un documento con usuario, fecha , contnido
     private static comentario NCome(Document documento) {
        comentario come = new comentario();
           come.setUsuario(documento.getString("usuario"));
           come.setFecha(documento.getDate("fecha"));
           come.setContenido(documento.getString("contenido"));
              return come;
    }
      
 // Encontrar posts por Tag y regresarlos en una lista de Posts
      public List<post> PTags(String tagg) {
        List<post> resultado = new ArrayList<>();
            for (Document documento : pousty.find(Filters.in("Tags", tagg))) {
                 resultado.add(DocPost(documento));
               }
                   return resultado;
    }

 // Eliminar post
      public void Borrar(post post) {
        DeleteResult delete = pousty.deleteOne(Filters.eq("Contenido", 
                                                           post.getCont()));
    }

// Agregar post
      public void Añadir(post post) {
        pousty.insertOne(GDocum(post));
    }

// Obtener Post por contenido
      public post PConte(String contenido) {
        Document documento = pousty.find(Filters.eq("Contenido", 
                                                    contenido)).first();
            post post = DocPost(documento);
                return post;
    }

// Agregar todos los comentarios del List
// Despues
// Actualizar comentarios
      public void GgCome(post post, List<comentario> comentario) {
        List<Document> comentarios = new ArrayList<>();
             for (comentario com : comentario) {
                  comentarios.add(GDocTod(com));
        } 
               UpdateResult update = pousty.updateOne(
                                           Filters.eq("Contenido", post.getCont()),
                                           Updates.set("Comentarios", comentarios));
    }

}
