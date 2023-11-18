import external.PayUAPI;
import external.PayUStatus;
import external.RazorPayAPI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final PaymentProvider paymentProvider = new PayUPaymentProvider();
    public static void main(String[] args) {
        paymentProvider.makePayment(1,"shikha", 9998);
        System.out.println(paymentProvider.verifyStatus(1L));
    }
    public static void original(String[] args) {
        String type = "razorpay";
        if(type.equals("razorpay")){
            RazorPayAPI api = new RazorPayAPI();
            api.pay("shikha yadav", 1000);
            int status = api.checkStatus();
        }else{
            PayUAPI api = new PayUAPI();
            api.order(2000);
            PayUStatus status = api.getStatus();
        }
    }
}