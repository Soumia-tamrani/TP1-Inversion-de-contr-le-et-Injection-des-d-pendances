package Pres;

import dao.DaoImple;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main (String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // DaoImple dao = new DaoImple();
        Scanner scanner = new Scanner(new File("Config.txt"));
//        System.out.println("Donner moi la classe de la couche dao :");
        String daoClass = scanner.nextLine();

        // Instanciation dynamique
         Class classdao = Class.forName(daoClass);
        IDao dao = (IDao) classdao.getConstructor().newInstance(); //=> new DaoImple()

        // Metier m = new Metier();
        String m = scanner.nextLine();
        Class classMetier = Class.forName(m) ;
        IMetier met = (IMetier) classMetier.getConstructor().newInstance(dao);

        // metier.setDao(dao); // statique
//        Method setDao = classMetier.getDeclaredMethod("setDao",IDao.class);
//        setDao.invoke(met,dao); // Injection des dependances dynamique

        System.out.println("Resultat du calcul est :"+met.calcul());

    }
}
