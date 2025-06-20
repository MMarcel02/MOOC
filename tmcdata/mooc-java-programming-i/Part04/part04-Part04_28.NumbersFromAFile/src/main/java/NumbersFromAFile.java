
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner filScanner = new Scanner(Paths.get(file))) {
            while (filScanner.hasNextLine()) {
                int number = Integer.valueOf(filScanner.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    counter++;   
                }
            }
            System.out.println("Numbers: " + counter);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}
