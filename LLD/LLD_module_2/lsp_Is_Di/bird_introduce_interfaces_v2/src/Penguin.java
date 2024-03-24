import interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {
    Penguin(Integer weight, String color){
        super(weight, color);
    }
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
