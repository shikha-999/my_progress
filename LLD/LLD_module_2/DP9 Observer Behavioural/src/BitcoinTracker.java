//step4 : implement concrete subject
public class BitcoinTracker extends ListBasedPublisherImpl { //or implements
    private Double price;

    void setPrice(Double price){
        this.price = price;
        notifyChange();
    }

}
