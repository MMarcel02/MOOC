
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        boolean found = false;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            while (fileScanner.hasNextLine()) {
                if (fileScanner.nextLine().equals(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found.");
                
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Reading the file " + file + " failed.");
        }

    }
}
