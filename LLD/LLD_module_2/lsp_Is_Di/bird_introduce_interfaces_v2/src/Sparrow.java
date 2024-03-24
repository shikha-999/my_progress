import interfaces.Flyable;
public class Sparrow extends Bird implements Flyable{
    private String color;
    public Sparrow(Integer weight, String color) {
        super(weight, color); //to pass data from Sparrow to Bird(parent class)
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying which has " + color);

    }
}
