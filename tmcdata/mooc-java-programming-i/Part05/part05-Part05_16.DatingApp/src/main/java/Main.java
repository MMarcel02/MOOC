
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate dayOne = new SimpleDate(1, 1, 0);
        System.out.println(dayOne);
        dayOne.advance(360);
        System.out.println(dayOne);
    }
}
