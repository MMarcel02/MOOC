
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            String[] sentenceSplit = sentence.split(" ");
            System.out.println(sentenceSplit[sentenceSplit.length - 1]);
        }

    }
}
