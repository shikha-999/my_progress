//concrete subscriber class (tweet - another use case)
public class Tweeter implements  Subscriber{
    @Override
    public void takeAction() {
        System.out.println("sending tweet!");
    }
}
