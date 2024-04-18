package extt;

import dao.IDao;

public class DaoImplVcapteur implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Capteur");
        return 100*Math.random()/20;
    }
}
