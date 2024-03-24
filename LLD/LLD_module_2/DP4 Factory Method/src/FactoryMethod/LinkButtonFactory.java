package FactoryMethod;

public class LinkButtonFactory implements ButtonFactoryInterface{
    @Override
    public Button createButton() {
        return new LinkButton();
    }
}
