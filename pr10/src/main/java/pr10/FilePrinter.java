package pr10;

import org.springframework.stereotype.Component;

@Component
public class FilePrinter implements IPrinter {
    @Override

    public String doPrint() {
        return("Im file printer");
    }
}
