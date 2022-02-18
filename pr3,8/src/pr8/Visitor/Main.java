package pr8.Visitor;

public class Main {
    public static void main(String[] args) {

        Project project = new Project();

        Developer junior = new JunDeveloper();
        Developer senior = new SenDeveloper();

        System.out.println("Junior is working...");

        project.bewritten(junior);
        System.out.println("\n");

        System.out.println("Senior is working...");

        project.bewritten(senior);
    }
}
