
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            //In java ^ does not mean to the power of, need to use Math.pow(value, to the power of)
            System.out.println((int)Math.pow(Integer.valueOf(number), 3));
            
        }
    }
}
