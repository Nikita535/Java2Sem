package pr8.Visitor;

public class Test implements ProjectElement{
    @Override
    public void bewritten(Developer developer) {
        developer.create(this);
    }
}
