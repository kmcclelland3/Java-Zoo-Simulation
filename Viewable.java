/**
 * This interface provides a percent of time asleep
 * variable and a view method to be implemented.
 * @author Kristen McClelland
 * @version 1.0
 */
public interface Viewable {
    final static double PERCENT_OF_TIME_ASLEEP = .25;
    /**
     * A view method that allows a user to interact with a Zoo Animal.
     */
    public void view();
}