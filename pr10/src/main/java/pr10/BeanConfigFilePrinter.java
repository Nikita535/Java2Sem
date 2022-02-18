package pr10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigFilePrinter {
    @Bean
    public IPrinter iprinter() {
        return new FilePrinter();
    }

    @Bean
    public Printer printer(IPrinter iprinter) {
        Printer fileprinter = new Printer();
        fileprinter.setPrinter(iprinter);
        return fileprinter;
    }
}
