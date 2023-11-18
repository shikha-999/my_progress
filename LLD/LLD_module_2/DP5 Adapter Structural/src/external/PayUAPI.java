package external;

public class PayUAPI {
    private int amount;

    public void prePay(String name){
        System.out.println("Prepaid by "+name);
    }
    public void order(int amount){
        this.amount = amount;
        System.out.println("PayUAPI payment amount RS."+amount); //call the API
    }
    public PayUStatus getStatus(){
        if((amount%2)== 0)
            return PayUStatus.SUCCESS; //successful
        else
            return PayUStatus.FAILURE;

    }

}
