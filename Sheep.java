/**
 * A Sheep is an Animal that has Pettable qualities.
 * @author Kristen McClelland
 * @version 1.0
 */
public class Sheep extends Animal implements Pettable {
    /**
     * A constructor that relies on the Animal constructor to
     * to dictate the name of this Sheep.
     */
    public Sheep() {
        this.name = "Sheep";
        Animal.incrementCount();
    }
    /**
     * Determines the amount of time a Sheep is petted,
     * if you finish petting the Sheep before it moves away,
     * calls the sound a Sheep makes, and moves the Sheep
     * appropriately depending on whether you finished petting
     * it or not.
     */
    public void pet() {
        int time = gen.nextInt(MAX_TIME_PETTABLE) + 1;
        int num = gen.nextInt(2);
        // you want to pet it for time minutes, but it may move
        // away before you pet for this amount of time
        if (num == 0) {
            System.out.print("You begin petting the sheep for "
                + time + " minutes. ");
            System.out.println(makeNoise());
            System.out.println(move());
            System.out.println("The sheep got tired and shuffles away "
                + "after " + time/2 + " minutes of petting.");
        } else {
            System.out.print("You pet the sheep for "
                + time + " minutes. ");
            System.out.println(makeNoise());
            System.out.println(move());
        }
    }
    /**
     * A Sheep makes the noise "Baaaaaaaaaaah" when called
     * upon.
     * @return String representation of the noise a Sheep
     * makes
     */
    public String makeNoise() {
        return "Baaaaaaaaaaah";
    }
    /**
     * Describes the movement a Sheep makes.
     * @return String representation of the movement a
     * Sheep makes
     */
    public String move() {
        return "The sheep shuffles closer to you.";
    }
}