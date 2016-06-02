import java.util.Scanner;
import java.util.Random;
/**
 * This is a driver that allows a user to interact with a zoo of
 * animals.
 * @author Kristen McClelland
 * @version 1.0
 */
public class ZooSimulation {

    // INSTANCE VARIABLES
    // YOUR CODE HERE
    // You can add any instance variables that you think will help you
    // write the homework.
    private Animal[] zooAnimals;
    private boolean[] petIndex;
    private boolean[] feedIndex;
    private boolean[] viewIndex;
    private Random gen = new Random();

    /**
     * Constructor for a Zoo Simulation that instantiates an array of
     * Animals that this zoo contains.
     */
    public ZooSimulation() {
        // YOUR CODE HERE
        // You'll need to add the animals to this array, including your
        // custom Animal. In the end there should be at least 6 elements
        zooAnimals = new Animal[6];
        zooAnimals[0] = new Sheep();
        zooAnimals[1] = new Pony();
        zooAnimals[2] = new KoiFish();
        zooAnimals[3] = new Bear();
        zooAnimals[4] = new Tiger();
        zooAnimals[5] = new Dolphin();
        // instantiate the indices indicating the locations of each of
        // the types of Animals
        petIndex = new boolean[zooAnimals.length];
        feedIndex = new boolean[zooAnimals.length];
        viewIndex = new boolean[zooAnimals.length];
        for (int i = 0; i < zooAnimals.length; i++) {
            Animal a = zooAnimals[i];
            if (a instanceof Pony || a instanceof Dolphin
                || a instanceof Sheep) {
                petIndex[i] = true;
            } else {
                petIndex[i] = false;
            }
            if (a instanceof Dolphin || a instanceof KoiFish
                || a instanceof Pony) {
                feedIndex[i] = true;
            } else {
                feedIndex[i] = false;
            }
            if (a instanceof Tiger || a instanceof Bear) {
                viewIndex[i] = true;
            } else {
                viewIndex[i] = false;
            }
        }
    }

    /**
     * Runs the Zoo Simulation, allowing a user to interact with different
     * Animals.
     * @param args Should be an empty String array
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ZooSimulation zoo = new ZooSimulation();

        System.out.println("Welcome to The Atlanta Zoo!");

        int input = 0;
        while (input != 6) {
            System.out.println("\nWould you like to:");
            System.out.println("1. List all of the animals");
            System.out.println("2. See an output of all animals"
                                + " and their actions");
            System.out.println("3. Pet an animal");
            System.out.println("4. Feed an animal");
            System.out.println("5. Watch an animal");
            System.out.println("6. Quit");
            System.out.println("Please enter one of the options above:");

            input = scan.nextInt();
            while (input < 1 || input > 6) {
                System.out.println("Please enter a number 1-6");
                input = scan.nextInt();
            }

            if (input == 1) {
                zoo.printAnimals();
            } else if (input == 2) {
                zoo.makeAnimalSounds();
            } else if (input == 3) {
                zoo.petAnimals();
            } else if (input == 4) {
                zoo.feedAnimals();
            } else if (input == 5) {
                zoo.viewAnimals();
            }
        }
    }

    /**
     * Prints out the number of Animals and what types of Animals
     * in this zoo.
     */
    private void printAnimals() {
        // Print the number of Animals instantiated
        System.out.println();
        System.out.println("There are " + Animal.getCount()
            + " animals in the zoo.");
        System.out.println("The animals found in this zoo are:");

        // DONT CHANGE THE REST OF THIS METHOD
        for (Animal a : zooAnimals) {
            System.out.println(a);
        }
    }

    /**
     * This invokes all of the Animals in this Zoo to make their
     * noises and move to demonstrate a sample of what characteristics
     * these Animals have.
     */
    private void makeAnimalSounds() {
        System.out.println(); // This line is for cleaner formatting
        // Invoke makeNoise and move for the animals in the zoo.
        for (Animal a : zooAnimals) {
            System.out.println(a);
            System.out.println(a.makeNoise());
            System.out.println(a.move());
            System.out.println();
        }
    }

    /**
     * This method randomly selects a Pettable Animal from the Zoo and
     * pets it, allowing the user to see the output.
     */
    private void petAnimals() {
        System.out.println();  // This line is for cleaner formatting
        // You need to randomly select a Pettable animal and then pet it.
        int index = gen.nextInt(petIndex.length);
        while (petIndex[index] == false) {
            index = gen.nextInt(petIndex.length);
        }
        Animal a = zooAnimals[index];
        if (a instanceof Sheep) {
            ((Sheep) a).pet();
        } else if (a instanceof Pony) {
            ((Pony) a).pet();
        } else if (a instanceof Dolphin) {
            ((Dolphin) a).pet();
        }
    }

    /**
     * This method randomly selects a Feedable Animal and calls its feed
     * method, allowing the user to see the output.
     */
    private void feedAnimals() {
        System.out.println();  // This line is for cleaner formatting
        // You need to randomly select a Feedable animal and then feed it.
        int index = gen.nextInt(feedIndex.length);
        while (feedIndex[index] == false) {
            index = gen.nextInt(feedIndex.length);
        }
        Animal a = zooAnimals[index];
        if (a instanceof Pony) {
            ((Pony) a).feed();
        } else if (a instanceof KoiFish) {
            ((KoiFish) a).feed();
        } else if (a instanceof Dolphin) {
            ((Dolphin) a).feed();
        }
    }

    /**
     * This method randomly selects a Viewable Animal and calls its
     * view method, allowing the user to see the output.
     */
    private void viewAnimals() {
        System.out.println();  // This line is for cleaner formatting
        // You need to randomly select a Viewable animal
        // and then attempt to view it.
        int index = gen.nextInt(viewIndex.length);
        while (viewIndex[index] == false) {
            index = gen.nextInt(viewIndex.length);
        }
        Animal a = zooAnimals[index];
        if (a instanceof Bear) {
            ((Bear) a).view();
        } else if (a instanceof Tiger) {
            ((Tiger) a).view();
        }
    }
}