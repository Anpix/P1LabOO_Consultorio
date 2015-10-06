package gui;

import dao.UsuarioDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Medica;
import model.Secretaria;
import model.Usuario;

// @author Anpix
 
@ManagedBean
@SessionScoped
public class guiUsuario {
    private Usuario usuario;
    private List<Usuario> usuarios;
    
    public guiUsuario() {
    }

    public void Iniciar(){
        usuarios = UsuarioDao.getUsuarios();
        usuario = new Usuario() {};
    }
    
    public void populate(){
        usuario = new Medica("Janete","1234");
        UsuarioDao.add(usuario);
        usuario = new Secretaria("Ana","1234");
        UsuarioDao.add(usuario);
        usuarios = UsuarioDao.getUsuarios();
        usuario = new Usuario(){};
    }
    
    public String redirect(){
        if (isLogged()) {
            return "home.xhtml";
        }else{
            return "login.xhtml";
        }
    }
    
    

    
    public boolean isLogged(){
        if (usuario.getLogin() == null) {
            return false;
        }else{
            return true;
        }
    }
    
    public boolean isMedica(Usuario usuario){
        if (usuario instanceof Medica){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isSecretaria(Usuario usuario){
        if (usuario instanceof Secretaria){
            return true;
        }else{
            return false;
        }
    }
    
    
    public String logar() throws Exception{
        Integer verify = 0;
        Boolean medica = null;
        for (Usuario u: usuarios) {
            if (u.getLogin().equals(usuario.getLogin())){
                verify = 1;
                if (isMedica(u)){
                    medica = true;
                }else if (isSecretaria(u)){
                    medica = false;
                }else{
                    medica = null;
                }
                if (u.getSenha().equals(usuario.getSenha())){
                    verify = 2;
                }
            }
        }
        if (verify == 0){
            //Não encontrou o login informado;
            throw new Exception("Não existe usuário");
        }else if(verify == 1 ){
            //Encontrou o usuário, mas a senha não coincide;
            throw new Exception("Senha Incorreta");
        }else if(verify == 2){
            if (medica == true){
                return "homem.xhtml";
            }else if (medica == false){
                return "homes.xhtml";
            }else{
                return "#";
            }
        }else{
            throw new Exception("Erro desconhecido");
        }
    }
    
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
