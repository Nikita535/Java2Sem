package pr10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfigConsolePrinter {
    @Bean
    public IPrinter iprinter() {
        return new ConsolePrinter();
    }

    @Bean
    public Printer printer(IPrinter iprinter) {
        Printer consoleprinter = new Printer();
        consoleprinter.setPrinter(iprinter);
        return consoleprinter;
    }


}
