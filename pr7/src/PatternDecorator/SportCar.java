package PatternDecorator;

public class SportCar implements Car{
    private Car car;

    public SportCar(Car car){
        this.car=car;
    }

    @Override
    public int getSpeed() {
        return this.car.getSpeed()+100;
    }

    @Override
    public int getWeight() {
        return this.car.getWeight();
    }
}
