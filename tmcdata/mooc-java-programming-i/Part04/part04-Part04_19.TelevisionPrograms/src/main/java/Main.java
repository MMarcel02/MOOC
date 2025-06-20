import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // different from original exercise so I can learn more
            System.out.println("Enter name and duration separated by comma: ");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }

            String[] detailsSplit = details.split(",");
            programs.add(new TelevisionProgram(detailsSplit[0], Integer.valueOf(detailsSplit[1])));
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram program:programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
