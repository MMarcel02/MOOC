
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container("First");
        Container container2 = new Container("Second");

        while (true) {

            System.out.println(container1);
            System.out.println(container2);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("quit")) {
                break;
            } 
            
            Integer value = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                container1.add(value);
            } else if (parts[0].equals("move")) {
                if (value >= container1.getAmount()) {
                    int temp = container1.getAmount();
                    container1.remove(temp);
                    container2.add(temp);
                } else {
                    container1.remove(value);
                    container2.add(value);
                }
            } else if (parts[0].equals("remove")) {
                container2.remove(value);
            } else if (parts[0].equals("quit")) {
                break;
            }

        }
    }

}
