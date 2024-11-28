package lab6;
/**
 * The {@code lab6.Counter} class implement the {@link Visitor} interface
 * <p>
 * The counter
 * This class provides an implementation of the {@link #visitButton(Button)} and {@link #visitPanel(Panel)} methods to
 * preform a specific operation defined in {@link Visitor#visitButton(Button)} and {@link Visitor#visitPanel(Panel)}
 * </p>

 */
public class Counter implements Visitor {
    private int buttonCount = 0;
    private int panelCount = 0;
    /**
     * {@link Counter#visitButton(Button)} method, put the button to increase the amount of button that this counter knows by one.
     * */
    @Override
    public void visitButton(Button button) {
        buttonCount++;
    }
    /**
     * {@link Counter#visitPanel(Panel)} method, put the button to increase the amount of button that this counter knows by one.
     * */
    @Override
    public void visitPanel(Panel panel) {
        panelCount++;
    }
    /**
     * {@link Counter#getCount()} method, return you the text with amount of object that has been counted.
     * */
    public String getCount() {
        return "Buttons: " + buttonCount + "\nPanels: " + panelCount;
    }
}
