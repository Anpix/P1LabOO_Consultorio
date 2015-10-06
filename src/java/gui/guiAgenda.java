package gui;

import dao.AgendaDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Agenda;

// @author Anpix
 
@ManagedBean
@SessionScoped
public class guiAgenda {
    private Agenda agenda;
    public static List<Agenda> agendas;
    /**
     * Creates a new instance of guiAluno
     */
    public guiAgenda() {
    }

    public void Iniciar(){
        agendas = AgendaDao.getAgendas();
        agenda = new Agenda();
    }
    
    public String gravar(){
        AgendaDao.add(agenda);
        return "LstAgenda";
    }
    
    
    
    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
  
}
