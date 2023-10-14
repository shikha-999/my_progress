import interfaces.Swimmable;
public class Penguin extends Bird implements Swimmable{
    Penguin(Integer weight, String color, BirdType type){
        super(weight, color, type);
    }
    public void swim(){
        System.out.println("Penguin is Swimming");
    }

    public void makeSound(){
        System.out.println("Penguin is making sound");
    }
}
