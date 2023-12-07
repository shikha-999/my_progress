import java.util.ArrayList;
import java.util.List;

//step3 : add a common implementation for publisher
public abstract class ListBasedPublisherImpl implements Publisher{
    private List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void notifyChange() {
//        for(Subscriber subscriber : subscribers){
//            subscriber.takeAction();
//        }
//        subscribers.forEach(subscriber -> subscriber.takeAction());
        subscribers.forEach(Subscriber::takeAction);  //lambda function Class::method
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
