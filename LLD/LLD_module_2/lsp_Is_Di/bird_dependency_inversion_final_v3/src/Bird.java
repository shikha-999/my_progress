public abstract class Bird {
    private int weight;
    private String color;
    private BirdType birdType;

    Bird(Integer weight, String color, BirdType birdType){
        this.weight = weight;
        this.color = color;
        this.birdType = birdType;
    }
    public abstract void makeSound();
}
