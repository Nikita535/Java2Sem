package pr8.TemplateMethode;

public abstract class ApplicationFramework {
    public ApplicationFramework() {
        templateMethod(); // Опасность!
    }

    abstract void customize1();

    abstract void customize2();

    final void templateMethod() {
        for (int i = 0; i < 5; i++) {
            customize1();
            customize2();
        }
    }
}
