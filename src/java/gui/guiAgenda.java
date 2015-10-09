package gui;

import dao.AgendaDao;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Agenda;

// @author Anpix
 
@ManagedBean
@SessionScoped
public class guiAgenda {
    private Agenda agenda;
    public List<Agenda> agendas;
    /**
     * Creates a new instance of guiAluno
     */
    public guiAgenda() {
    }

    public String Iniciar(){
        agendas = AgendaDao.getAgendas();
        return "frmAgendas";
    }
    
    public void populate(){
        //Gera dados apenas para popular o DAO;
        Calendar data = Calendar.getInstance();
        
        data.set(Calendar.DAY_OF_MONTH, 5);
        data.set(Calendar.MONTH, 10);
        data.set(Calendar.YEAR, 2015);
        
        agenda = new Agenda(data);
        gravar();
        
        data.set(Calendar.DAY_OF_MONTH, 6);
        agenda = new Agenda(data);
        gravar();
        
        data.set(Calendar.DAY_OF_MONTH, 7);
        agenda = new Agenda(data);
        gravar();
        
        data.set(Calendar.DAY_OF_MONTH, 8);
        agenda = new Agenda(data);
        gravar();
        
        data.set(Calendar.DAY_OF_MONTH, 9);
        agenda = new Agenda(data);
        gravar();
    }
    
    public String gravar(){
        AgendaDao.add(agenda);
        return "frmAgendas";
    }
    
    
    public String newAgenda(){
        return "addAgenda";
    }
    
    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public List<Agenda> getAgendas() {
        return agendas;
    }

    public void addAgendas(Agenda agenda) {
        this.agendas.add(agenda);
    }
}
