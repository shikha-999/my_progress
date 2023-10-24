// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //create instance of registry for using registry
    private static PrototypeRegistry registry = new PrototypeRegistry();
    public static void main(String[] args) {
        //step 4: creating prototype
        BackgroundObject prototype = new BackgroundObject(0, 0, 0, BackgroundObjectType.TREE);

        //use registry after creating prototype
        registry.register(prototype);

        //step 5: creating new object (clone)
        //instead of calling constructor, call clone method
        BackgroundObject clone = prototype.clone();

        //modify the clone as needed, Setters
        clone.setX(100);
        clone.setY(200);

        //creating copies in loop
        for(int i=0; i<5; i++){
            BackgroundObject cloneLoop = prototype.clone();

            cloneLoop.setX(10);
            cloneLoop.setY(50);
        }
        createTrees();
    }

    //another method, accessing Prototype in this new method
    public static void createTrees(){
//        not to create prototype again, place to store prototype
//        use existing one
//        BackgroundObject prototype = registry.getPrototype(BackgroundObjectType.TREE);

//        create clone of protoype
//        BackgroundObject clone = prototype.clone();

        BackgroundObject clone = registry.clone(BackgroundObjectType.TREE);

        clone.setX(999);
        System.out.println(clone.getType()+" "+clone.getX());
    }
}