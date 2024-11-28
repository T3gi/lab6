package lab6;
/**
 * The {@code lab6.Component} interface
 * The base
 */
public interface Component {
    /**
     * {@link Component#accept(Visitor)} method, if you implement this interface don`t forget to override it.
     * */
    void accept(Visitor visitor);
    /**
     * {@link Component#name()} method, if you implement this interface don`t forget to override it.
     * */
    void name();
}
