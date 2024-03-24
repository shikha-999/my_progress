package org.example.simpleFactory;

public class Main {
    public static void main(String[] args) {
        //tightly coupled
//        Button primaryButton = new PrimaryButton();
//        Button roundButton = new RoundButton();

        Button primaryButton = ButtonFactory.createButton(ButtonType.PRIMARY);
        Button roundButton = ButtonFactory.createButton(ButtonType.ROUND);

        primaryButton.onCLick();
        roundButton.onCLick();
    }
}
