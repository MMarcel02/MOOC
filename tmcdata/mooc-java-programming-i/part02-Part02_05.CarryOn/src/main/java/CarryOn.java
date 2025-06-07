
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (!(exit.equals("no"))) {
            System.out.println("Shall we carry on?");
            exit = scanner.nextLine();
        }
    }
}
