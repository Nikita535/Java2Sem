package pr10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context1 =new AnnotationConfigApplicationContext(BeanConfigConsolePrinter.class);
        Printer printer1 =context1.getBean(Printer.class);
        printer1.doPrint();

        ApplicationContext context2 =new AnnotationConfigApplicationContext(BeanConfigFilePrinter.class);
        Printer printer2=context2.getBean(Printer.class);
        printer2.doPrint();

        ApplicationContext context3 =new AnnotationConfigApplicationContext(BeanConfig.class);
        Printer printer3=context3.getBean(Printer.class);
        printer3.doPrint();

    }
}
