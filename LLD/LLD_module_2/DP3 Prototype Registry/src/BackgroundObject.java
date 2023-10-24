
public class BackgroundObject implements GraphicalObject{
    //step 2 - create subclasses
    //attributes of location of a tree (co-ordinates)
    //These x,y,z values will change
    private Integer x;
    private Integer y;
    private Integer z;
    private BackgroundObjectType type;  //enum

    //all arguments constructor
    public BackgroundObject(Integer x, Integer y, Integer z, BackgroundObjectType type) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
    }

    public void setX(Integer x){
        this.x = x;
    }
    public void setY(Integer y){
        this.y = y;
    }

    public Integer getX(){
        return x;
    }
    public Integer getY(){
        return y;
    }
    public BackgroundObjectType getType() {
        return type;
    }

    //color render - RGB pixels (image/video/visual)
    //pixels tell what is Green value, Red value
    //creating BG object expensive, bcoz for all data we should have this list of pixels
    //private List<Integer>pixels;

    //step 3 : implement clonable interface
    @Override
//    public GraphicalObject clone() {
//        //no nested datatypes, so easy to create a new object/copy object
//        return new BackgroundObject(x, y, z, type);
//    }

    //it should give background object
    //return type is BackGroundObject
    public BackgroundObject clone(){
        return new BackgroundObject(x, y, z, type);
    }
}
//libraries - common lang, apache commons -> copy shallow/deep- for nested fields
