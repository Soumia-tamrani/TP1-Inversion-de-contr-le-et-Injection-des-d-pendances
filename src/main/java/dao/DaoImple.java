package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImple implements IDao {


    public DaoImple() {
    }
    @Override
    public double getData() {
        System.out.println("Version Base de donnees");
        double s = 133;
        return s;
    }
}
