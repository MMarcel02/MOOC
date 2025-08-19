
public class Main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift toy = new Gift("Lego", 1);

        Package giftParcel = new Package();

        giftParcel.addGift(book);
        giftParcel.addGift(toy);

        System.out.println(giftParcel.totalWeight());
    }
}