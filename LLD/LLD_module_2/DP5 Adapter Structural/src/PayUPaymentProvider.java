import external.PayUAPI;
import external.PayUStatus;

public class PayUPaymentProvider implements PaymentProvider {
    PayUAPI api = new PayUAPI();
    @Override
    public void makePayment(int id, String name, int amount) {
        api.prePay(name);
        api.order(amount);
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        return toPaymentStatus(api.getStatus());
    }

    private static PaymentStatus toPaymentStatus(PayUStatus status){
        return switch (status) {
            case SUCCESS -> PaymentStatus.OK;
            case FAILURE -> PaymentStatus.ERROR;
        };
    }
}
