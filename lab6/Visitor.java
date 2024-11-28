package lab6;
/**
 * The {@code lab6.Component} interface
 * The visitor
 */
public interface Visitor {
    /**
     * {@link Visitor#visitButton(Button)} method, if you implement this interface don`t forget to override it.
     * */
    void visitButton(Button button);
    /**
     * {@link Visitor#visitPanel(Panel)} method, if you implement this interface don`t forget to override it.
     * */
    void visitPanel(Panel panel);
}
