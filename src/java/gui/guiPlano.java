package gui;

import dao.PlanoDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.PlanoSaude;

// @author Anpix

@ManagedBean
@SessionScoped
public class guiPlano {
    private PlanoSaude plano;
    private List<PlanoSaude> planos;

    public guiPlano(){
    }
    
    public String iniciar(){
        planos = PlanoDao.getPlanos();
        return "frmPlanos";
    }
    
    public void populate(){
        plano = new PlanoSaude("Unimed");
        gravar();
        plano = new PlanoSaude("Bradesco");
        gravar();
        plano = new PlanoSaude("Amil");
        gravar();
    }
    
    public String gravar(){
        PlanoDao.add(plano);
        planos = PlanoDao.getPlanos();
        return "frmPlanos";
    }
    
    public String excluir(PlanoSaude plano){
        PlanoDao.remove(plano);
        return null;
    }

    public String novo(){
        plano = new PlanoSaude();
        return "addPlano";
    }
    
    
    
    public List<PlanoSaude> getPlanos() {
        return planos;
    }

    public void setPlanos(List<PlanoSaude> planos) {
        this.planos = planos;
    }
    
    public void setPlano(PlanoSaude plano) {
        this.plano = plano;
    }
    
    public PlanoSaude getPlano() {
        return plano;
    }
}
