package pr8.Visitor;

public class DataBase implements ProjectElement{
    @Override
    public void bewritten(Developer developer) {
        developer.create(this);
    }
}
