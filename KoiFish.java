/**
 * A Koi Fish is an Animal with Feedable qualities.
 * @author Kristen McClelland
 * @version 1.0
 */
public class KoiFish extends Animal implements Feedable {
    /**
     * A constructor that relies on the Animal constructor
     * to dictate the name of this Koi Fish.
     */
    public KoiFish() {
        this.name = "Koi Fish";
        Animal.incrementCount();
    }
    /**
     * A Koi Fish makes the sound "Blub blub" when called
     * upon.
     * @return String representation of the noise a Koi Fish
     * makes
     */
    public String makeNoise() {
        return "Blub blub";
    }
    /**
     * Describes the movement a Koi Fish makes.
     * @return String representation of the movement a
     * Koi Fish makes
     */
    public String move() {
        return "The koi fish swims closer to you.";
    }
    /**
     * Determines whether the Koi Fish is fed and if so, how much
     * food it recieves.
     */
    public void feed() {
        int steal = gen.nextInt(4);
        int feed = gen.nextInt(MAX_AMOUNT_OF_FOOD) + 1;
        System.out.println("Koi fish eat pellets.");
        if (steal == 0) {
            System.out.print("Another fish ate the pellets "
                + "instead of the koi fish. ");
        } else {
            System.out.print("You feed the koi fish " + feed
                + " pellets. ");
        }
        System.out.println(makeNoise());
        // move away
        System.out.println("The koi fish swims away from you.");
    }
}