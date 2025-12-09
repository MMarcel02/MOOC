
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfInts = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number > 0) {
                listOfInts.add(Integer.valueOf(number));
            } else if (number == 0) {
                int sum = 0;
                for (Integer value : listOfInts) {
                    sum += value;
                }

                if (listOfInts.size() > 0) {
                    double averageOfPositiveNumbers = sum/ (double) listOfInts.size();
                    System.out.println(averageOfPositiveNumbers);
                    break;
                } else {
                    System.out.println("Cannot calculate the average");
                    break;
                }

            }
        }

    }
}
