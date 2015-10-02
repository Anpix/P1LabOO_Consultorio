package dao;

// @author Anpix

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioDao {
        public static List<Usuario> usuarios = new ArrayList();
    
    public static List<Usuario> getUsuarios(){
        return usuarios;
    }
    
    public static void add(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public static void remove(Usuario usuario){
        usuarios.remove(usuario);
    }
}
