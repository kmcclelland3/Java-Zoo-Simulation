/**
 * This interface provides a max time to pet variable
 * and a pet method to be implemented.
 * @author Kristen McClelland
 * @version 1.0
 */
public interface Pettable {
    final static int MAX_TIME_PETTABLE = 10;
    /**
     * A pet method that allows a user to interact with a Zoo Animal.
     */
    public void pet();
}