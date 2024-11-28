package lab6;

import java.util.ArrayList;
import java.util.List;
/**
 * The {@code lab6.ObjectManager} class
 * The class which counts other classes
 */
public class ObjectManager {
    private List<Component> components = new ArrayList<>();
    /**
     * {@link ObjectManager#addComponent(Component)} method, put the component to add it to the managers list, so it can observe it.
     * */
    public void addComponent(Component component){
        components.add(component);
    }
    /**
     * {@link ObjectManager#count(Visitor)} method, put the visitor which you want to store the results of calculations to.
     * */
    public void count(Visitor visitor){
        for (Component component : components) {
            component.accept(visitor);
        }
    }
}
