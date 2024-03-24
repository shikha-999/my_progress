package FactoryMethod;

//step 2: create subclasses
public class PrimaryButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Primary Button Clicked");
    }
}
