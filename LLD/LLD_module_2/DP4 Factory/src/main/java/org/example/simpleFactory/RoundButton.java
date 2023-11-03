package org.example.simpleFactory;

//step 2: create subclasses
public class RoundButton implements Button{
    public void onCLick() {
        System.out.println("Round button clicked");
    }
}
