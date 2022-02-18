package prac5;
// позволяет нам, опять же, осуществить ленивую реализацию благодаря особенностям самой Джавы.
// Дело в том, что внутренние классы загружаются только тогда, когда мы обращаемся к ним впервые -
// в отличии от "внешних" классов, которые загружаются сразу при запуске программы.
// Более того, она потокобезопасна - за счет той же особенности.
public class SecondSingleton {
    public SecondSingleton() {
        System.out.println("Singleton created!");
    }

    private static class SingletonHolder {
        public static final SecondSingleton HOLDER_INSTANCE = new SecondSingleton();
    }
    public static SecondSingleton getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }

    @Override
    public String toString() {
        return "SecondSinglton{}";
    }
}
