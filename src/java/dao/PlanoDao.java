package dao;

// @author Anpix

import java.util.ArrayList;
import java.util.List;
import model.PlanoSaude;

public class PlanoDao {
    public static List<PlanoSaude> planos = new ArrayList();
    
    public static List<PlanoSaude> getPlanos(){
        return planos;
    }
    
    public static void add(PlanoSaude plano){
        planos.add(plano);
    }
    
    public static void remove(PlanoSaude plano){
        planos.remove(plano);
    }
}
