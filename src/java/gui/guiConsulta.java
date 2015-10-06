package gui;

import dao.ConsultaDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Consulta;

// @author Anpix
 
@ManagedBean
@SessionScoped
public class guiConsulta {
    private Consulta consulta;
    public static List<Consulta> consultas;
    /**
     * Creates a new instance of guiAluno
     */
    public guiConsulta() {
    }

    public void Iniciar(){
        consultas = ConsultaDao.getConsultas();
        consulta = new Consulta();
    }
    
    public String gravar(){
        ConsultaDao.add(consulta);
        return "LstConsulta";
    }
    
    
    
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
  
}
