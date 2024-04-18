package Pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
        IMetier metier = (IMetier) context.getBean("metier"); // sous casting

        System.out.println("Resultat est " +metier.calcul());
    }
}
