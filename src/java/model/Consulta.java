package model;

// @author Anpix

import java.util.Calendar;

public class Consulta implements Marcacao{
    private Calendar dataConsulta;
    private Calendar horaInicio;
    private Calendar horaFim;
    private boolean revisao;
    private boolean encaixe;
    private static Calendar dataLimiteMarcacaoFutura;
    private static Integer limiteEncaixes = 3;
    private Paciente paciente;

    public Consulta(Calendar dataConsulta, boolean revisao, Paciente paciente) {
        this.dataConsulta = dataConsulta;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.revisao = revisao;
        this.encaixe = encaixe;
        this.paciente = paciente;
    }
    
    
    
    
    
    
    @Override
    public void marcarConsulta() {
        if (this.revisao == true){
            //
        }else{
            
        }
    }
    
    
    
}
