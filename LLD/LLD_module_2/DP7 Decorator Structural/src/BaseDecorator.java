//step 3: create the base decorators
//Abstract class - cant make object of this  class
public abstract class BaseDecorator implements Database{
    //need next(corresponding) layer
    //,so we need Reference
    //protected -> child class might require it
    //to get access to Database -> need constructor -> @AllArgsConstructor
    protected Database innerLayer;

    public BaseDecorator(Database innerLayerPassed) {
        this.innerLayer = innerLayerPassed;
    }

    @Override
    public String read() {
        return innerLayer.read();
    }

    @Override
    public void write(String input) {
        innerLayer.write(input);
    }
}
