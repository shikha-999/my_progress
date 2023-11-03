package org.example.simpleFactory;

//step 2: create subclasses

public class PrimaryButton implements Button{
    @Override
    public void onCLick() {
        System.out.println("Primary button clicked");
    }
}
