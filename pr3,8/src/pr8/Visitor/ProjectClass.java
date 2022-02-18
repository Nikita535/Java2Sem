package pr8.Visitor;

public class ProjectClass implements  ProjectElement{
    @Override
    public void bewritten(Developer developer) {
        developer.create(this);
    }
}
