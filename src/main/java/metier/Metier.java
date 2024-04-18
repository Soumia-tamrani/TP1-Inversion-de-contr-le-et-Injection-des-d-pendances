package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class Metier implements IMetier{
    //@Autowired : injecte a cette variable un objet de type IDao
    //@Qualifier("vws") : pour eviter la confusion entre deux class de type Idao pour faire l'injection mais faut specifie @Component("")
    @Autowired
    private IDao dao ; //couplage faible
    @Override
    public double calcul() {
        double t = dao.getData()*30;
        return t;
    }
    // injection en utilisant le constructeur
    public Metier(IDao dao) {
        this.dao = dao;


    }

    public Metier() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
