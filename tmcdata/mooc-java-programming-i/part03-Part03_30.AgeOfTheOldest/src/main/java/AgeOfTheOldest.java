
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            String[] sentenceSplit = sentence.split(",");
            if (Integer.valueOf(sentenceSplit[1]) > oldest) {
                oldest = Integer.valueOf(sentenceSplit[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
