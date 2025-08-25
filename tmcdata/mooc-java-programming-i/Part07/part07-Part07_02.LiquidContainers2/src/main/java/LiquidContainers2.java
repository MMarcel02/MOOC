
import java.util.Scanner;


public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {

            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            if (parts.length < 2) {
                System.out.println("Please provide a value!");
                continue;
            }

            int value = Integer.valueOf(parts[1]);

            if(command.equals("add")){
                container1.add(value);
            } else if (command.equals("move")) {
                container1.move(value, container2);
            } else if (command.equals("remove")) {
                container2.remove(value);
            }
        }
    }

}
