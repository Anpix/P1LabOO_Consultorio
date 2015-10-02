package model;

// @author Anpix

import java.util.List;


public abstract class Usuario implements Autenticacao{
    private static List<Usuario> usuarios;
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    @Override
    public void logar(String login, String senha) throws Exception {
        Integer verify = 0;
        for (Usuario u: usuarios) {
            if (u.login == login){
                verify = 1;
                if (u.senha == senha){
                    verify = 2;
                }
            }
        }
        if (verify == 0){
            throw new Exception("Não existe usuário");
        }else if(verify == 1 ){
            throw new Exception("Senha Incorreta");
        }
    }
}
