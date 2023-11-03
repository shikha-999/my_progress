package FactoryMethod;

//step 2: create subclasses
public class LinkButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Link Button Clicked");
    }
}
