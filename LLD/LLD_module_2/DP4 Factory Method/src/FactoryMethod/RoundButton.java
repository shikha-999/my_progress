package FactoryMethod;

//step 2: create subclasses
public class RoundButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Round button clicked");
    }
}
