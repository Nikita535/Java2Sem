package PatternDecorator;

public class TruckCar implements Car{
    private Car car;

    public TruckCar(Car car){
        this.car=car;
    }

    @Override
    public int getSpeed() {
        return this.car.getSpeed();
    }

    @Override
    public int getWeight() {
        return this.car.getWeight()+1000;
    }
}
