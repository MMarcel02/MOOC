import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String newJoke = scanner.nextLine();
                jokes.addJoke(newJoke);
            } else if (input.equals("2")) {
                System.out.println(jokes.drawJoke());
            } else if (input.equals("3")) {
                System.out.println("Printing jokes.");
                jokes.printJokes();
            } else if (input.equals("X")) {
                break;
            }
            
        }
        
    }


}
