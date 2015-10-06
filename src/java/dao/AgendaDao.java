package dao;

// @author Anpix

import java.util.ArrayList;
import java.util.List;
import model.Agenda;

public class AgendaDao {
    public static List<Agenda> agendas = new ArrayList();
    
    public static List<Agenda> getAgendas(){
        return agendas;
    }
    
    public static void add(Agenda agenda){
        agendas.add(agenda);
    }
    
    public static void remove(Agenda agenda){
        agendas.remove(agenda);
    }
}
