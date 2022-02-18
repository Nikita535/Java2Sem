package pr8.Visitor;

public class JunDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("writing poor class..");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("drop data base...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not relaibale test...");
    }
}
