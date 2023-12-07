//step5 : create concrete observer
public class EmailSender implements Subscriber{
    @Override
    public void takeAction() {
        System.out.println("Email sent on price change");
    }
}
