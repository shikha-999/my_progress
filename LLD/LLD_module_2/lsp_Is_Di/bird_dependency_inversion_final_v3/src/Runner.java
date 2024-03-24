import interfaces.Flyable;
import interfaces.Swimmable;

public class Runner {
    public static void main(String[] args) {
        Flyable crow = new Crow(10, "black",BirdType.CROW, new FlappingBehaviour());
        crow.fly(); //fly -> Bird

        Swimmable penguin = new Penguin(20, "black", BirdType.PENGUIN);
        penguin.swim();
        //penguin.makeSound(); Bird Class method not of Swimmable interface
        ((Bird) penguin).makeSound(); //casting

        Bird swan = new Swan(30, "white", BirdType.SWAN, new GlidingBehaviour());
        swan.makeSound();
        //swan.swim();
        //swan.fly();
        ((Swimmable) swan).swim();
        ((Flyable) swan).fly();
    }
}
