package model;

// @author Anpix

import dao.AgendaDao;
import java.util.Calendar;

public class Consulta implements Marcacao{
    private Calendar dataConsulta;
    private Calendar horaInicio;
    private Calendar horaFim;
    private boolean revisao;
    private boolean encaixe;
    private Calendar dataLimiteMarcacaoFutura;
    private Integer limiteEncaixes = 3;
    private Paciente paciente;

    public Consulta(Calendar dataConsulta, boolean revisao, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.revisao = revisao;
        this.paciente = paciente;
    }

    public Consulta() {
    }
    
    
    
    
    @Override
    public void marcarConsulta() {
        if (this.revisao == true){
            //
        }else{
            //
        }
    }
    
    private Agenda procAgenda(){
        //Procura agenda
        for(int i=0; i < AgendaDao.agendas.size(); i++) {
            if (AgendaDao.agendas.get(i).getDataAgenda() == dataConsulta){
                return AgendaDao.agendas.get(i);
            }
        }
        return null;
    }
}
