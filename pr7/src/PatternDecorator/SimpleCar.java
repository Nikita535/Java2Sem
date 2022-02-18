package PatternDecorator;

public class SimpleCar implements Car{
    private int speed=50;
    private int weight=1000;

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}
