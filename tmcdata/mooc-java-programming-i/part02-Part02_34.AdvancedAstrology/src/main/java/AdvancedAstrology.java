
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i <= number; i++) {
            System.out.print("*");
        }
    }
    
    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number ; i++) {
            System.out.print(" ");
        }
    }
    
    public static void printTriangle(int size) {
        // part 2 of the exercise
        int starCount = 0;
        for (int i = size - 1; i >= 0; i--) {
            printSpaces(i);
            printStars(starCount);
            starCount++;
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int starCount = 0;
        for (int i = height - 1; i >= 0; i--) {
            printSpaces(i);
            printStars(starCount);
            starCount += 2;
            System.out.println("");
        }
        printSpaces(height-2);
        printStars(2);
        System.out.println("");

        printSpaces(height-2);
        printStars(2);
        System.out.println("");

    }
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        // christmasTree(10);
    }
}
