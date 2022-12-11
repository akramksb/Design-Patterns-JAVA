package ma.enset;

import ma.enset.service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"ma.enset.service", "ma.enset.aspects"})
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        IMetier metier = applicationContext.getBean(IMetier.class);
        metier.process();
        System.out.println(metier.compute());
    }
}
