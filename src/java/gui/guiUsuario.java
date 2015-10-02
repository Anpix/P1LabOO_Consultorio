package gui;

import dao.UsuarioDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Medico;
import model.Secretaria;
import model.Usuario;

// @author Anpix
 
@ManagedBean
@SessionScoped
public class guiUsuario {
    private Usuario usuario;
    public static List<Usuario> usuarios;
    /**
     * Creates a new instance of guiAluno
     */
    public guiUsuario() {
    }

    public String Iniciar(int value){
        //usuarios = UsuarioDao.getUsuarios();
        if (value == 1) {
            usuario = new Medico("Janete","1234");
        } else if (value == 2) {
            usuario = new Secretaria("Ana","1234");
        }
        return "frmHome";
    }
    
    public String gravar(){
        UsuarioDao.add(usuario);
        return "LstAutores";
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
