package model;

// @author Anpix

import java.util.Calendar;
import java.util.List;


public class Agenda {
    private Calendar horaPrimeiraConsulta;
    private Calendar horaUltimaConsulta;
    private Calendar horaInicioAlmoco;
    private DiaSemana diaSemana;
    private Consultorio consultorio;
    private List<Consulta> consultas;

    public Agenda(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
        
        //Define almoço como 12:30
        Calendar almoco = Calendar.getInstance();
        almoco.set(Calendar.HOUR_OF_DAY,12);
        almoco.set(Calendar.MINUTE,30);
        this.horaInicioAlmoco = almoco;
        
        //Define como 9:00;
        Calendar nove = Calendar.getInstance();
        nove.set(Calendar.HOUR_OF_DAY, 9);
        
        //Define como 10:00
        Calendar dez = Calendar.getInstance();
        dez.set(Calendar.HOUR_OF_DAY, 10);
        
        //Define como 18:00
        Calendar dezoito = Calendar.getInstance();
        dezoito.set(Calendar.HOUR_OF_DAY, 18);
        
        if (diaSemana == DiaSemana.Segunda || diaSemana == DiaSemana.Sexta){
            this.consultorio = Consultorio.RioDasOstras;
            this.horaPrimeiraConsulta = nove;
            this.horaUltimaConsulta = dezoito;
        }else if(diaSemana == DiaSemana.Terca || diaSemana == DiaSemana.Quarta){
            this.consultorio = Consultorio.Centro;
            this.horaPrimeiraConsulta = dez;
            this.horaUltimaConsulta = dezoito;
        }else if(diaSemana == DiaSemana.Quinta){
            this.consultorio = Consultorio.Cavaleiros;
            this.horaPrimeiraConsulta = dez;
            this.horaUltimaConsulta = dezoito;
        }
        
        
        
        
    }

    public Calendar getHoraPrimeiraConsulta() {
        return horaPrimeiraConsulta;
    }

    public void setHoraPrimeiraConsulta(Calendar horaPrimeiraConsulta) {
        this.horaPrimeiraConsulta = horaPrimeiraConsulta;
    }

    public Calendar getHoraUltimaConsulta() {
        return horaUltimaConsulta;
    }

    public void setHoraUltimaConsulta(Calendar horaUltimaConsulta) {
        this.horaUltimaConsulta = horaUltimaConsulta;
    }

    public Calendar getHoraInicioAlmoco() {
        return horaInicioAlmoco;
    }

    public void setHoraInicioAlmoco(Calendar horaInicioAlmoco) {
        this.horaInicioAlmoco = horaInicioAlmoco;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void addConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }
    public void remConsulta(Consulta consulta){
        this.consultas.remove(consulta);
    }
    
    
    
    
    
}
