package org.example.simpleFactory;

public class ButtonFactory {
    static Button createButton(ButtonType type) {
        switch (type) {
            case PRIMARY:
                return new PrimaryButton();
            case ROUND:
                return new RoundButton();
            case LINK:
                return new LinkButton();
        }
        throw new RuntimeException("Invalid button type " + type);
    }
}

