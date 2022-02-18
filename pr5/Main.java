package prac5;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 реализация выдает один и тот же объект");
        System.out.println(FirstSingleton.getInstance().toString());
        System.out.println(FirstSingleton.getInstance().toString());
        System.out.println(FirstSingleton.getInstance().toString());
        System.out.println(FirstSingleton.getInstance().toString());

        System.out.println("2 реализация выдает один и тот же объект");
        System.out.println(SecondSingleton.getInstance());
        System.out.println(SecondSingleton.getInstance().toString());
        System.out.println(SecondSingleton.getInstance().toString());
        System.out.println(SecondSingleton.getInstance().toString());

        System.out.println("3 реализация выдает один и тот же объект");
        System.out.println(ThirdSingleton.INSTANCE);
        System.out.println(ThirdSingleton.INSTANCE);
        System.out.println(ThirdSingleton.INSTANCE);
        System.out.println(ThirdSingleton.INSTANCE);
        System.out.println(ThirdSingleton.INSTANCE);
    }
}
