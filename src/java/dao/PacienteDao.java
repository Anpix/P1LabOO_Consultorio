package dao;

// @author Anpix

import java.util.ArrayList;
import java.util.List;
import model.PacienteParticular;


public class PacienteDao {
    public static List<PacienteParticular> pacientes = new ArrayList();
    
    public static List<PacienteParticular> getPacientes(){
        return pacientes;
    }
    
    public static void add(PacienteParticular paciente){
        pacientes.add(paciente);
    }
    
    public static void remove(PacienteParticular paciente){
        pacientes.remove(paciente);
    }
}
