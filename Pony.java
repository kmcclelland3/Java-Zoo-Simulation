/**
 * A Pony is an Animal that has Pettable and Feedable qualities.
 * @author Kristen McClelland
 * @version 1.0
 */
public class Pony extends Animal implements Pettable, Feedable {
    /**
     * A constructor that relies on the Animal constructor to
     * to dictate the name of this Pony.
     */
    public Pony() {
        this.name = "Pony";
        Animal.incrementCount();
    }
    /**
     * A Pony makes the noise "Whinny" when called upon.
     * @return String representation of the noise a Pony
     * makes
     */
    public String makeNoise() {
        return "Whinny";
    }
    /**
     * Describes the movement a Pony makes.
     * @return String representation of the movement a
     * Pony makes
     */
    public String move() {
        return "The pony clip-clops closer to you.";
    }
    /**
     * Determines the amount of time a Pony is petted, calls
     * the sound a Pony makes, and moves the Pony closer.
     */
    public void pet() {
        int time = gen.nextInt(MAX_TIME_PETTABLE) + 1;
        System.out.print("You pet the pony for "
            + time + " minutes. ");
        System.out.println(makeNoise());
        System.out.println(move());
    }
    /**
     * Determines how much food the Pony is fed.
     */
    public void feed() {
        int feed = gen.nextInt(MAX_AMOUNT_OF_FOOD);
        System.out.println("Ponies eat hay.");
        System.out.print("You feed the pony " + feed
            + " bales of hay. ");
        System.out.println(makeNoise());
        System.out.println("The pony clip-clops away.");
    }
}