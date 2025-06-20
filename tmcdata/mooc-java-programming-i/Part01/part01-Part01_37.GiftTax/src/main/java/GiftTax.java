
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift <= 25000) {
            System.out.println("Tax: " + (100 + ((double) gift - 5000)*0.08));
        } else if (gift <= 55000) {
            System.out.println("Tax: " + (1700 + ((double) gift - 25000)*0.10));
        } else if (gift <= 200000) {
            System.out.println("Tax: " + (4700 + ((double) gift - 55000)*0.12));
        } else if (gift <= 1000000) {
            System.out.println("Tax: " + (22100 + ((double) gift - 200000)*0.15));
        }  else if (gift > 1000000) {
            System.out.println("Tax: " + (142100 + ((double) gift - 1000000)*0.17));
        }
    }
}
