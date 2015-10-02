package model;

// @author Anpix

import java.util.Calendar;


public class PacienteDePlano extends Paciente{
    private PlanoSaude planoSaude;
    
    
    public PacienteDePlano(String nome, Calendar dataNascimento, Calendar dataPrimeiraConsulta, String email, Telefone telefone, PlanoSaude plano){
        super(nome, telefone);
        this.planoSaude = plano;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }
}
