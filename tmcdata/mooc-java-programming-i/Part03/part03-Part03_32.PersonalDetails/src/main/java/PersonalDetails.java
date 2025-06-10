
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfAges = 0;
        int amountOfInputs = 0;
        String longestName = "";
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            String[] sentenceSplit = sentence.split(",");
            if (sentenceSplit[0].length() > longestName.length()) {
                longestName = sentenceSplit[0];
            }
            sumOfAges = sumOfAges + Integer.valueOf(sentenceSplit[1]);
            amountOfInputs++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sumOfAges * 1.0 / amountOfInputs));


    }
}
