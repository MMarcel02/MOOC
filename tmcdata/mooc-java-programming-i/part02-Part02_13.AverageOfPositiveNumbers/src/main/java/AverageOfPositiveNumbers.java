
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input > 0) {
                numberOfNumbers = numberOfNumbers + 1;
                sum = sum + input;
                continue;
            } else {
                continue;
            }
        }
        if (numberOfNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (1.0 * sum)/numberOfNumbers );
        }
    }
}
