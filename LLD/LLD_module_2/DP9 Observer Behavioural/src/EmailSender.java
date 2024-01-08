//step5 : create concrete subscriber (observer)
public class EmailSender implements Subscriber{ //extends
    @Override
    public void takeAction() {
        System.out.println("Email sent on price change");
    }
}
