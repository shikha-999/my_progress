package org.example.simpleFactory;

//step 2: create subclasses
public class LinkButton implements Button{
    public void onCLick() {
        System.out.println("Link button clicked");
    }
}
