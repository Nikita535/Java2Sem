package pr10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer{
    private IPrinter printer;


    public void doPrint() {
        System.out.println("Что-то печатаю..."+printer.doPrint());
    }

@Autowired
    public void setPrinter(IPrinter printer){
        this.printer=printer;
    }
}
