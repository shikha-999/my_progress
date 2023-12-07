// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BitcoinTracker tracker = new BitcoinTracker();
        tracker.addSubscriber(new EmailSender());
        tracker.addSubscriber(new Tweeter());

        tracker.setPrice(1000000000.0);
    }
}