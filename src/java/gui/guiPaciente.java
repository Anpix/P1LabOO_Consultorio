package gui;

import dao.PacienteDao;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Paciente;
import model.PacienteDePlano;
import model.PacienteParticular;
import model.Telefone;
import model.PlanoSaude;

// @author Anpix

@ManagedBean
@SessionScoped
public class guiPaciente {
    private Paciente paciente;
    private List<Paciente> pacientes;
    
    private String nome;
    private String strTelefone;
    private List<Telefone> telefones;
    private Date dataNasc;
    private String nomePlano;
    private boolean temPlano;

    
    
    
    public guiPaciente(){
    }
    
    public String iniciar(){
        pacientes = PacienteDao.getPacientes();
        return "frmPacientes";
    }
    
    public void populate(){
        //Gera dados apenas para popular o DAO;
        Calendar nasc = Calendar.getInstance();
        Calendar prim = Calendar.getInstance();
        
        nasc.set(Calendar.YEAR, 1991);
        prim.set(Calendar.MONTH, 0);
        
        //String nome, Calendar dataNascimento, Calendar dataPrimeiraConsulta, String email, Telefone telefone, PlanoSaude plano
        
        paciente = new PacienteParticular("Fulano da Silva","+5522987654321");
        gravar();
        paciente = new PacienteParticular("Ciclano da Rocha","+5522993499783");
        gravar();
        paciente = new PacienteParticular("Beltrano Guedes","+5522987123876");
        gravar();
        paciente = new PacienteParticular("Tesclano Soares","+5522945672345");
        gravar();
        paciente = new PacienteParticular("Richard Rich","+5522986347234");
        gravar();
        paciente = new PacienteDePlano("teste",nasc,"teste@anpix.com.br",new Telefone("+5522998112233"),new PlanoSaude("teste"));
        gravar();
    }
    
    public String gravar(){
        PacienteDao.add(paciente);
        pacientes = PacienteDao.getPacientes();
        return "frmPacientes";
    }
    
    
    
    
    
    
    
    
    
    public void addTelefone(String tel){
        telefones.add(new Telefone(tel));
    }
    
    
    
  

    
    public String excluir(Paciente paciente){
        PacienteDao.remove(paciente);
        return null;
    }

    
    public String addPaciente(){
        if (temPlano == true){
            //paciente = new PacienteDePlano();
        }else{
            //paciente = new PacienteParticular();
        }
        return "CadPaciente";
    }

    public String novoPaciente(){
        return "addPaciente";
    }
    
    
    
    
    
    
    
    
    
    
    
    public boolean isTemPlano() {
        return temPlano;
    }

    public void setTemPlano(boolean temPlano) {
        this.temPlano = temPlano;
    }
    
    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }
    
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStrTelefone() {
        return strTelefone;
    }

    public void setStrTelefone(String strTelefone) {
        this.strTelefone = strTelefone;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
}
