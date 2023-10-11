public class Bird{
    private Integer weight;
    private String color;
    private BirdType type; //enum

    public Bird(Integer weight, String color, BirdType type) {
        this.weight = weight;
        this.color = color;
        this.type = type;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public BirdType getType() {
        return type;
    }

    public void fly(){
        if(type == BirdType.SPARROW)
            System.out.println("Sparrow is flying");
        else if (type == BirdType.CROW)
            System.out.println("Crow is flying");
    }
}
//data model
//dto - data transfer object
//pojo - plain old java object