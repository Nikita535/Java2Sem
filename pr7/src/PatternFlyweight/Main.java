package PatternFlyweight;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DeveloperFabric developerFabric=new DeveloperFabric();

        List<Developer> developers=new ArrayList<>();

        developers.add(developerFabric.getDeveloperSpec("Java"));
        developers.add(developerFabric.getDeveloperSpec("Java"));
        developers.add(developerFabric.getDeveloperSpec("Java"));
        developers.add(developerFabric.getDeveloperSpec("Java"));
        developers.add(developerFabric.getDeveloperSpec("Java"));
        developers.add(developerFabric.getDeveloperSpec("Java"));
        developers.add(developerFabric.getDeveloperSpec("Java"));
        developers.add(developerFabric.getDeveloperSpec("JS"));
        developers.add(developerFabric.getDeveloperSpec("JS"));
        developers.add(developerFabric.getDeveloperSpec("JS"));
        developers.add(developerFabric.getDeveloperSpec("JS"));
        developers.add(developerFabric.getDeveloperSpec("JS"));
        developers.add(developerFabric.getDeveloperSpec("JS"));
        developers.add(developerFabric.getDeveloperSpec("JS"));
        developers.add(developerFabric.getDeveloperSpec("JS"));

        for(Developer developer:developers){
            developer.writeCode();
        }
    }
}
