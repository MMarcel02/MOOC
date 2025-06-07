
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                numberOfNumbers = numberOfNumbers + 1;
                sum = sum + input;
                continue;
            }
        }
        System.out.println("Average of the numbers: " + (1.0 * sum)/numberOfNumbers );
    }
}
