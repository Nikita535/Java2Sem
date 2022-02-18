package prac5;
//Теперь мы реализовали Singleton через Enum.
//Это очень удобно - мы можем не прописывать явно приватный конструктор
public enum ThirdSingleton {
    INSTANCE;
    private ThirdSingleton() {
        System.out.println("Singleton created! By the way, in Enums the constructor is private by default - so there is no need to write private constructor by yourself");
    }
}
