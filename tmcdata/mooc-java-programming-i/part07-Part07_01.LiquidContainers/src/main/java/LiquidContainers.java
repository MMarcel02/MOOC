
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        int container1 = 0;
        int container2 = 0;

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

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

            if (value < 0) {
                continue;
            } else if(command.equals("add")){
                if (container1 + value <= 100) {
                    container1 += value;
                } else {
                    container1 = 100;
                }
            } else if (command.equals("move")) {
                if (value > container1 && !(container1 - value < 0)) {
                    if (container2 + value <= 100) {
                        container1 = 0;
                        container2 += value;
                    } else {
                        container1 -= value;
                        container2 = 100;
                    }
                } else if (value > container1 && container1 - value < 0) {
                    if (container2 + container1 <= 100) {
                        container2 += container1;
                        container1 = 0;
                    } else {
                        container1 -= 0;
                        container2 = 100;
                    }
                } else {
                    if (container2 + value <= 100) {
                        container1 -= value;
                        container2 += value;
                    } else {
                        container1 -= value;
                        container2 = 100;
                    }
                }
            } else if (command.equals("remove")) {
                if (container2 - value <= 0) {
                    container2 = 0;
                } else {
                    container2 -= value;
                }
            }

        }
    }

}
