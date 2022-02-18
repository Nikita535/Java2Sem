package pr10;

import org.springframework.stereotype.Component;

@Component
public class ConsolePrinter implements IPrinter {
    @Override

    public String doPrint() {
        return "Im console printer";
    }
}
