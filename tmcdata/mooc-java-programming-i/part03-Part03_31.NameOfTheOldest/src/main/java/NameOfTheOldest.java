
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            String[] sentenceSplit = sentence.split(",");
            if (Integer.valueOf(sentenceSplit[1]) > oldest) {
                oldestName = sentenceSplit[0];
                oldest = Integer.valueOf(sentenceSplit[1]);
            }
        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
