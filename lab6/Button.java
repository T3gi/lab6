package lab6;
/**
 * The {@code lab6.Button} class implement the {@link Component} interface
 * <p>
 * The point
 * This class provides an implementation of the {@link #accept(Visitor)} {@link #name()} and method to preform a
 * specific operation defined in {@link Component#accept(Visitor)} and {@link Component#name()}
 * </p>
 */
public class Button implements Component{
    private String name;
    /**
     * Constructor of the {@link Button} class, put the name to create one.
     * */
    public Button(String name) {
        this.name = name;
    }
    /**
     * {@link Button#name()} method, return the name of the button.
     * */
    @Override
    public void name(){
        System.out.printf(" %s ", name);
    }
    /**
     * {@link Button#accept(Visitor)} method, needed for the counter.
     * */
    @Override
    public void accept(Visitor visitor){
        visitor.visitButton(this);
    }
}
