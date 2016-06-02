/**
 * A Bear is an Animal and has Viewable qualities.
 * @author Kristen McClelland
 * @version 1.0
 */
public class Bear extends Animal implements Viewable {
    /**
     * A constructor that relies on the Animal constructor
     * to dictate the name of this Bear.
     */
    public Bear() {
        this.name = "Bear";
        Animal.incrementCount();
    }
    /**
     * A Bear makes the noise "Grrrrrrrrr" when called
     * upon.
     * @return String representation of the noise a Bear
     * makes
     */
    public String makeNoise() {
        return "Grrrrrrrr";
    }
    /**
     * Describes the movement a Bear makes
     * @return String representation of the movement a
     * Bear makes
     */
    public String move() {
        return "The bear runs around the enclosure.";
    }
    /**
     * Determines what a person would see when attempting
     * to view this Bear. The Bear is either asleep or
     * swimming in its pool.
     */
    public void view() {
        if (gen.nextDouble() > PERCENT_OF_TIME_ASLEEP) {
            System.out.print("The bear is swimming in its pool. ");
            System.out.println(makeNoise());
            System.out.println(move());
        } else {
            System.out.println("The bear is asleep.");
            System.out.println("zzz");
        }
    }
}