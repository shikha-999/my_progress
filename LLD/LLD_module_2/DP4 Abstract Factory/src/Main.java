// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

public class Main {
    private static ThemeFactory themeFactory = new LightThemeFactory();
    public static void main(String args[]){
//        Button button = new DarkButton();
//        CheckBox checkBox = new LightCheckbox();
        Button button = themeFactory.createButton();
        button.onClick();
        CheckBox checkBox = themeFactory.createCheckBox();
        checkBox.onSelect();
    }
}