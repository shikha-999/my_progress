//step4 : implement concrete publisher (subject)
public class BitcoinTracker extends ListBasedPublisherImpl { //or implements
    private Double price;

    void setPrice(Double price){
        this.price = price;
        notifyChange();
    }

}
