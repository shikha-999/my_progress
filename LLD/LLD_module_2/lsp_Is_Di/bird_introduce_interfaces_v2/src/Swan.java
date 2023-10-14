import interfaces.Flyable;
import interfaces.Swimmable;

public class Swan extends Bird implements Swimmable, Flyable {
    Swan(Integer weight, String color){
        super(weight, color);
    }

    @Override
    public void swim() {
        System.out.println("Swan is Swimming");
    }

    @Override
    public void fly() {
        System.out.println("Swan is flying");
    }
}
