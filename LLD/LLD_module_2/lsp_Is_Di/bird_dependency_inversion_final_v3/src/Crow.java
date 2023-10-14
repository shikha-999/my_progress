import interfaces.Flyable;
import interfaces.FlyingBehaviour;

public class Crow extends Bird implements Flyable{
    FlyingBehaviour flyingBehaviour;
    Crow(Integer weight, String color, BirdType type, FlyingBehaviour flyingBehaviour){
        super(weight, color, type);
        this.flyingBehaviour = flyingBehaviour;
    }

    public void makeSound(){
        System.out.println("Crow is making sound");
    }

    public void fly(){
        System.out.print("Crow is ");
        flyingBehaviour.makeFly();
    }
}
