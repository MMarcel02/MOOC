
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Idsland", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Same!");
        } else {
            System.out.println("Strange things are afoot.");
        }

    }
}
