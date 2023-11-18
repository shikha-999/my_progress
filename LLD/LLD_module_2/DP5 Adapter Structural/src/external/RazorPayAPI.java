package external;

//step 1 : Create external classes (incompatible interfaces)
public class RazorPayAPI {
    private int amount;
    public void pay(String name, int amount){
        this.amount = amount;
        System.out.println("Razorpay payment by "+ name + " of amount : Rs." + amount);
    };

    public int checkStatus(){
        if((amount%2)== 0)
            return 1; //successful
        else
            return 0;

    }
}
