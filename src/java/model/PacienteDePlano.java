package model;

// @author Anpix

import java.util.Calendar;

public class PacienteDePlano extends Paciente{
    private PlanoSaude planoSaude;
    
    public PacienteDePlano(String nome, Calendar dataNascimento, String email, Telefone telefone, PlanoSaude plano){
        super();
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setEmail(email);
        this.addTelefone(telefone);
        this.setPlanoSaude(plano);
    }

    public PacienteDePlano() {
    }

    
    
    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude plano) {
        this.planoSaude = plano;
    }
}
