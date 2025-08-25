import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdList birds;

    public UserInterface(Scanner scan) {
        this.scanner = scan;
        this.birds = new BirdList();
    }

    public void addBird() {
        System.out.print("\nName: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        birds.addBird(name, latinName);
    }

    public void addObservation() {
        System.out.print("\nBird? ");
        String name = scanner.nextLine();

        boolean found = false;

        for (Bird bird : birds.getBirds()) {
            if (bird.getName().equals(name)) {
                bird.recordObservation();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public void printAll() {
        System.out.println();
        for (Bird bird : birds.getBirds()) {
            System.out.println(bird);
        }
    }

    public void printSpecificBird() {
        System.out.print("\nBird? ");
        String name = scanner.nextLine();

        boolean found = false;

        for (Bird bird : birds.getBirds()) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.print("\n? ");
            String command = scanner.nextLine();

            switch (command) {
                case "Add":
                    addBird();
                    break;
                case "Observation":
                    addObservation();
                    break;
                case "All":
                    printAll();
                    break;
                case "One":
                    printSpecificBird();
                    break;
                case "Quit":
                    running = false;
                    break;
                default:
                    System.out.println("\nUnknown command");
                    break;
            }
            
        }
    }


}
