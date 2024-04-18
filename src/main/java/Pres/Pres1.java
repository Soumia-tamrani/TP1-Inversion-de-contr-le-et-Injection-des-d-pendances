package Pres;

import dao.DaoImple;
import dao.IDao;
import metier.IMetier;
import metier.Metier;

 public class Pres1 {
    public static void main(String[] args) {
//        using Setters *Instaciation statique*
        IDao d = new DaoImple();
        Metier m = new Metier(d);
        System.out.println(m.calcul());
        // Injection via le constructeur
        Metier meti = new Metier(d);
//        m.setDao(d); //injection des dependances
        System.out.println("Resultat :" +(m.calcul()));









    }

}
