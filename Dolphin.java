/**
 * A Dolphin is an Animal and has Pettable and
 * Feedable qualities.
 * @author Kristen McClelland
 * @version 1.0
 */
public class Dolphin extends Animal implements Pettable, Feedable {
    /**
     * A constructor that relies on the Animal constructor
     * to dictate the name of this Dolphin.
     */
    public Dolphin() {
        this.name = "Dolphin";
        Animal.incrementCount();
    }
    /**
     * A Dolphin makes the noise "A-a-a-a-a" when called
     * upon.
     * @return String representation of the noise a Dolphin
     * makes
     */
    public String makeNoise() {
        return "A-a-a-a-a";
    }
    /**
     * Describes the movement a Dolphin makes.
     * @return String representation of the movement a
     * Dolphin makes
     */
    public String move() {
        return "The dolphin flippers closer to you.";
    }
    /**
     * Determines the amount of time a Dolphin is petted, calls
     * the sound a Dolphin makes, and moves the Dolphin closer.
     */
    public void pet() {
        int time = gen.nextInt(MAX_TIME_PETTABLE) + 1;
        System.out.print("You pet the dolphin for " + time
            + " minutes. ");
        System.out.println(makeNoise());
        System.out.println(move());
    }
    /**
     * Determines whether the Dolphin is fed and if so, how much
     * food it recieves.
     */
    public void feed() {
        System.out.println("Dolphins eat fish.");
        int steal = gen.nextInt(5);
        int feed = gen.nextInt(MAX_AMOUNT_OF_FOOD) + 1;
        if (steal == 0) {
            System.out.println("Another dolphin stole the fish.");
        } else {
            System.out.print("You feed the dolphin " + feed
                + " fish. ");
        }
        System.out.println(makeNoise());
        System.out.println("The dolphin flippers away from you.");
    }
}