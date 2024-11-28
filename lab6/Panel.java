package lab6;

import java.util.ArrayList;
import java.util.List;
/**
 * The {@code lab6.Panel} class implement the {@link Component} interface
 * <p>
 * The point
 * This class provides an implementation of the {@link #accept(Visitor)} {@link #name()} and method to preform a
 * specific operation defined in {@link Component#accept(Visitor)} and {@link Component#name()}
 * </p>
 */
public class Panel implements Component{
    String name;
    private List<Component> components = new ArrayList<>();
    /**
     * Constructor of the {@link Panel} class, put the name to create one.
     * */
    public Panel(String name) {
        this.name = name;
    }
    /**
     * {@link Panel#addComponent(Component)} method, add the component to the list of the properties of this panel.
     * */
    public void addComponent(Component component){
        components.add(component);
    }
    /**
     * {@link Panel#removeComponent(Component)} method, remove the component from the list of the properties of this panel.
     * */
    public void removeComponent(Component component){
        components.remove(component);
    }
    /**
     * {@link Panel#name()} method, return the text message.
     * */
    @Override
    public void name(){
        System.out.printf("%s: {",name);
        for (Component component : components) {
            component.name();
        }
        System.out.print("}");
    }
    /**
     * {@link Panel#accept(Visitor)} method, needed for the counter.
     * */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPanel(this);
    }

}
