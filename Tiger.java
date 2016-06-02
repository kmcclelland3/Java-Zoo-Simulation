/**
 * A Tiger is an Animal that has Viewable qualities.
 * @author Kristen McClelland
 * @version 1.0
 */
public class Tiger extends Animal implements Viewable {
    /**
     * A constructor that relies on the Animal constructor to
     * to dictate the name of this Tiger.
     */
    public Tiger() {
        this.name = "Tiger";
        Animal.incrementCount();
    }
    /**
     * A Tiger makes the noise "Rawwrrrrr" when called
     * upon.
     * @return String representation of the noise a Tiger
     * makes
     */
    public String makeNoise() {
        return "Rawwrrrrrr";
    }
    /**
     * Describes the movement a Tiger makes.
     * @return String representation of the movement a
     * Tiger makes
     */
    public String move() {
        return "The tiger is running across the field.";
    }
    /**
     * Determines what a person would see when attempting
     * to view this Tiger. The Tiger is either asleep or
     * running across the field.
     */
    public void view() {
        if (gen.nextDouble() > 2*PERCENT_OF_TIME_ASLEEP) {
            System.out.print("The tiger is stalking his prey. ");
            System.out.println(makeNoise());
            System.out.println(move());
        } else {
            System.out.println("The tiger is asleep.");
            System.out.println("zzz");
        }
    }
}