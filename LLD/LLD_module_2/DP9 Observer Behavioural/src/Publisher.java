//step1 : create the subject interface - object of interest - BTC Price/iPhone
public interface Publisher {
    void notifyChange(); //called when change in bitcoin price
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
}
