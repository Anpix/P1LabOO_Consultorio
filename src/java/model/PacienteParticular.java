package model;

// @author Anpix

import java.util.Calendar;


public class PacienteParticular extends Paciente{

    public PacienteParticular(String nome, Calendar dataNascimento, Calendar dataPrimeiraConsulta, String email, Telefone telefone) {
        super(nome, telefone);
    }
    
}
