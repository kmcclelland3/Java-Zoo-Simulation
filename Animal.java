import java.util.Random;
/**
 * This class creates an Animal object with generic
 * characteristics that will be overridden in child classes
 * @author Kristen McClelland
 * @version 1.0
 */
public abstract class Animal {
    protected String name;
    protected Random gen = new Random();
    private static int count;
    /**
     * Describes the noise that each Animal makes.
     * @return String representing the Animal's noise
     */
    public String makeNoise() {
        return "Not overriden";
    }
    /**
     * Describes the movement that each Animal makes.
     * @return String representing the Animal's movement
     */
    public String move() {
        return "Not overriden";
    }
    /**
     * Returns what type of Animal this Animal is.
     * @return String representing what type of Animal
     * this is
     */
    public String toString() {
        return name;
    }
    /**
     * Returns a count of how many Animal objects have
     * been instantiated.
     * @return int number representing number of Animal
     * objects
     */
    public static int getCount() {
        return count;
    }
    /**
     * Increments the static count variable to keep track of the
     * number of Animals instantiated.
     */
    protected static void incrementCount() {
        count++;
    }
}