package model;

// @author Anpix

public abstract class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha){
        setLogin(login);
        setSenha(senha);
    }

    public Usuario() {
    }
    

    public String getLogin() {
        String l = login;
        return l;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        String s = senha;
        return s;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}
