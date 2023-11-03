package FactoryMethod;

public class RoundButtonFactory implements ButtonFactoryInterface{
    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
