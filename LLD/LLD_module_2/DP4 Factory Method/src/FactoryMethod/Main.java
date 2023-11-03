package FactoryMethod;

public class Main {
    //only changeable place
   // private static ButtonFactoryInterface buttonFactoryObj = new PrimaryButtonFactory();
    private static ButtonFactoryInterface buttonFactoryObj = new RoundButtonFactory();
    public static void main(String[] args) {
        Button button = buttonFactoryObj.createButton();
        button.onClick();
    }
}
