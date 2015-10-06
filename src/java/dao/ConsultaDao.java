package dao;

// @author Anpix

import java.util.ArrayList;
import java.util.List;
import model.Consulta;

public class ConsultaDao {
    public static List<Consulta> consultas = new ArrayList();
    
    public static List<Consulta> getConsultas(){
        return consultas;
    }
    
    public static void add(Consulta consulta){
        consultas.add(consulta);
    }
    
    public static void remove(Consulta consulta){
        consultas.remove(consulta);
    }
}
