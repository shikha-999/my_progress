//step 2: create the adapter interface
public interface PaymentProvider {
    //make payment
    void makePayment(int id, String name,int amount);
    //check status
    PaymentStatus verifyStatus(Long id);
    //enum is best way to Statuses, Types etc
}
