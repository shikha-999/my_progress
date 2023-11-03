package FactoryMethod;

//step 4 : create factory subclasses
public class PrimaryButtonFactory implements ButtonFactoryInterface{
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
