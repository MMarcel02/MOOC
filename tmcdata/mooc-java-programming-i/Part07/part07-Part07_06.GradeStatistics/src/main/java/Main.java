
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        GradeDistribution pointsDistribution= new GradeDistribution();

        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else if (input >= 0 && input <=100) {
                pointsDistribution.addPoint(new Point(input));
            }
        }

        pointsDistribution.printAverage();
        pointsDistribution.printAverageOfPassing();

        System.out.println("Grade distribution:");
        pointsDistribution.printGradeDistribution();

    }
}
