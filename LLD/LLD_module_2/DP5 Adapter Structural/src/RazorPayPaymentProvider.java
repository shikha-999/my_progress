import external.RazorPayAPI;

//step 3: implement concrete adapter sub classes
public class RazorPayPaymentProvider implements PaymentProvider{
    private RazorPayAPI api = new RazorPayAPI();
    @Override
    public void makePayment(int id, String name, int amount) {
        api.pay(name, amount);
    }
//step 4: Adapt/Transform common contract to provider specific contract
    @Override
    public PaymentStatus verifyStatus(Long id) {
        int status = api.checkStatus();
        return toPaymentStatus(status);
    }
    //Mapper Methods/transformations
    private static PaymentStatus toPaymentStatus(int status){
        if(status == 0){
            return PaymentStatus.ERROR;
        }else{
            return PaymentStatus.OK;
        }
    }
}
