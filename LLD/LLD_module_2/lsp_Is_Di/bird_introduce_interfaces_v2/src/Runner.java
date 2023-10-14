import interfaces.Flyable;
import interfaces.Swimmable;

public class Runner {
    public static void main(String[] args) {
        Flyable crow = new Crow(100, "white");
        crow.fly();

        Swimmable penguin = new Penguin(50, "black");
        penguin.swim();

        Flyable swan = new Swan(10, "white");
        swan.fly();
        //swan.swim(); error

        Swimmable swan1 = new Swan(10, "white");
        swan1.swim();
        //swan1.fly();  error
    }
}
