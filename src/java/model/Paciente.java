package model;

//@author Anpix

import java.util.Calendar;
import java.util.List;

public abstract class Paciente {
    private String nome;
    private Calendar dataNascimento;
    private Calendar dataPrimeiraConsulta;
    private String email;
    private List<Telefone> telefones;
    private String telefone;
    
    public Paciente() {
    }

    public Paciente(String nome, Telefone telefone) {
        this.nome = nome;
        this.telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Calendar getDataPrimeiraConsulta() {
        return dataPrimeiraConsulta;
    }

    public void setDataPrimeiraConsulta(Calendar dataPrimeiraConsulta) {
        this.dataPrimeiraConsulta = dataPrimeiraConsulta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }
    
    public void remTelefones(Telefone telefone) {
        this.telefones.remove(telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
