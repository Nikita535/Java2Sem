package pr8.Visitor;

public class Project implements ProjectElement{

    ProjectElement []projectElements;
    public Project(){
        this.projectElements=new ProjectElement[]{
              new ProjectClass(),
              new DataBase(),
              new Test()
        };
    }
    @Override
    public void bewritten(Developer developer) {
        for(ProjectElement elements:projectElements){
            elements.bewritten(developer);
        }
    }
}
