package extt;

import dao.IDao;

public class DaoImplVws implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double i = 9000*Math.random()*Math.pow(2,8);
        return i;
    }
}
