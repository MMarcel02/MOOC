
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")) {
                break;
            }
            String[] sentenceSplit = sentence.split(" ");
            for (String word : sentenceSplit) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }

    }
}
