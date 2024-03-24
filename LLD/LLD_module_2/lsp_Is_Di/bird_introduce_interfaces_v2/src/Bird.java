public abstract class Bird{  //abstract class
    public Integer weight;
    private String color;
    private BirdType type; //enum

    public Bird(Integer weight, String color) {
        this.weight = 999;
        this.color = color;
    }

}
//data model
//dto - data transfer object
//pojo - plain old java object