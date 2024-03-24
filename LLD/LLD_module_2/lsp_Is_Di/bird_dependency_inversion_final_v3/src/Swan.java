import interfaces.Flyable;
import interfaces.FlyingBehaviour;
import interfaces.Swimmable;

import java.sql.SQLOutput;

public class Swan extends Bird implements Flyable, Swimmable {
    FlyingBehaviour flyingBehaviour;
    Swan(Integer weight, String color, BirdType type,FlyingBehaviour flyingBehavior){
        super(weight, color, type);
        this.flyingBehaviour = flyingBehavior;
    }

    public void fly(){
        System.out.print("Swan is ");
        flyingBehaviour.makeFly();
    }

    public void swim(){
        System.out.println("Swan is swimming");
    }

    public void makeSound(){
        System.out.println("Swan is making sound");
    }
}
