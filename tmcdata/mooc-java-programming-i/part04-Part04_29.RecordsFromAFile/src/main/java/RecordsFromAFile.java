
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] lineSplit = line.split(",");
                if (lineSplit[1].equals("1")) {
                    System.out.println(lineSplit[0] + ", age: " + lineSplit[1] + " year");
                } else {
                    System.out.println(lineSplit[0] + ", age: " + lineSplit[1] + " years");

                }
            }    
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e.getMessage());
        }
    }
}
