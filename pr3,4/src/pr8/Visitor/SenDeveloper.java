package pr8.Visitor;

public class SenDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after jun...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Fixed data base...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
