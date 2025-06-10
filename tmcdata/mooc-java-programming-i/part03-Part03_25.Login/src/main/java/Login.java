
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        if (
            username.equals(usernames[0]) && password.equals(passwords[0]) ||
            username.equals(usernames[1]) && password.equals(passwords[1])) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
