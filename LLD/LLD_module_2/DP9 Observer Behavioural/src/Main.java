// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BitcoinTracker tracker = new BitcoinTracker(); //concrete publisher class , (goldTracker)
        tracker.addSubscriber(new EmailSender()); //EmailSender is concrete subscriber class
        tracker.addSubscriber(new Tweeter()); //Tweeter is concrete subscriber class

        tracker.setPrice(1000000000.0);
    }
    //step 1: create tracker object
    //step 2: add subscribers
    //step 3: set price for notification
}