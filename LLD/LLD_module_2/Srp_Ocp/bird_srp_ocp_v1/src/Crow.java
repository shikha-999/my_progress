public class Crow extends Bird{
    private String color;
    private Integer weight;
    public Crow(Integer weight, String color){
        super(weight, color);
        this.color = color;
        this.weight = weight;
    }
    @Override
    public void fly() {
        System.out.println("Crow is Flying having color " + color + "having weight " + weight);
    }
}
