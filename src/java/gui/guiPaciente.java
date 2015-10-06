package gui;

import dao.PacienteDao;
import java.util.Calendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Paciente;
import model.PacienteDePlano;
import model.PacienteParticular;
import model.Telefone;

// @author Anpix

@ManagedBean
@SessionScoped
public class guiPaciente {
    private Paciente paciente;
    private String nomePlano;
    private List<Paciente> pacientes;

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
        paciente = new PacienteParticular("Fulano da Silva",new Telefone("+5522987654321"));
        gravar();
        paciente = new PacienteParticular("Ciclano da Rocha",new Telefone("+5522993499783"));
        gravar();
        paciente = new PacienteParticular("Beltrano Guedes",new Telefone("+5522987123876"));
        gravar();
        paciente = new PacienteParticular("Tesclano Soares",new Telefone("+5522945672345"));
        gravar();
        paciente = new PacienteParticular("Richard Rich",new Telefone("+5522986347234"));
        gravar();
        paciente = new Paciente() {};
        gravar();
    }
    
    public String gravar(){
        paciente.addTelefone(new Telefone(paciente.getTelefone()));
        PacienteDao.add(paciente);
        pacientes = PacienteDao.getPacientes();
        return "frmPacientes";
    }
    
    public String novoPacienteDePlano(){
        paciente = new PacienteDePlano();
        return "addPacientePlano";
    }
    
    public String novoPacienteParticular(){
        paciente = new PacienteParticular();
        return "addPacienteParticular";
    }
    
    public String excluir(Paciente paciente){
        PacienteDao.remove(paciente);
        return null;
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

    public String addPacienteDePlano(){
        paciente = new PacienteDePlano();
        return "CadPacienteDePlano";
    }
    
    public String addPacienteParticular(){
        paciente = new PacienteParticular();
        return "CadPacienteDePlano";
    }
}
