package prac5;
// Нетерпеливая инициализация
//засчёт приватного конструктора по умолчанию класс не может наследоваться
//экзэмпляр может создаваться только внутри данного класса, а также с помощью public метода getInstance()
//всегда будет создаваться один и тот же объект
//"Ленивая инициализация" полезна, когда создание объекта класса Singleton очень ресурсоемкое.
// Оно может тормозить программу, если будет выполняться при запуске.
// Мы же создаем объект только когда первый раз вызываем специальный метод.
public class FirstSingleton {
    private static final FirstSingleton instance = new FirstSingleton();

    private FirstSingleton(){
        System.out.println("Singleton created!");
    }
    public static FirstSingleton getInstance(){
            return instance;
        }

    @Override
    public String toString() {
        return "First{}";
    }
}
