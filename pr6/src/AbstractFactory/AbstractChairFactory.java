package AbstractFactory;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicianChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}
