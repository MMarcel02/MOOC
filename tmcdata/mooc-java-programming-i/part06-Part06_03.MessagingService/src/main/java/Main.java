
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message hello = new Message("Marcel", "hello");
        MessagingService tracker = new MessagingService();

        tracker.add(hello);
        System.out.println(tracker.getMessages());
    }
}
