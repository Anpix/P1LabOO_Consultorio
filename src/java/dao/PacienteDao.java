package dao;

// @author Anpix

import java.util.ArrayList;
import java.util.List;
import model.Paciente;

public class PacienteDao {
    public static List<Paciente> pacientes = new ArrayList();
    
    public static List<Paciente> getPacientes(){
        return pacientes;
    }
    
    public static void add(Paciente paciente){
        pacientes.add(paciente);
    }
    
    public static void remove(Paciente paciente){
        pacientes.remove(paciente);
    }
}
