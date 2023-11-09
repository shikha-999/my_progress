//step 2: create product concrete classed
public class LightCheckBox implements CheckBox{
    @Override
    public void onSelect() {
        System.out.println("Light CheckBox was selected");
    }
}
