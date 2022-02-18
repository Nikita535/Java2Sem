package PatternDecorator;

public class Main {
    public static void main(String[] args) {
        //Создаём объект класса SimpleCar, чтобы позде добавить ему св-ва
        SimpleCar simpleCar = new SimpleCar();
        System.out.println("Speed of simple car - " + simpleCar.getSpeed());
        System.out.println("Simple car can accept baggage with weight " + simpleCar.getWeight());

        //по сути мы просто добавляем св-ва спорт кара к обычной машине - это и есть назначение паттерна
        //декоратор, расширять возможности шаблона
        Car sportCar = new SportCar(simpleCar);

        System.out.println("Speed of sport car - " + sportCar.getSpeed());
        System.out.println("Sport car can accept baggage with weight " + sportCar.getWeight());

        Car truck = new TruckCar(simpleCar);

        System.out.println("Speed of truck - " + String.valueOf(truck.getSpeed()));
        System.out.println("Truck can accept baggage with weight " +
                String.valueOf(truck.getWeight()));
    }
}