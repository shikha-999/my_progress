import java.util.HashMap;
import java.util.*;

public class PrototypeRegistry {
    //store all data in hashmap <BGOtype, BGO>
    //initialize your collections else Null pointer Exception
    private Map<BackgroundObjectType, BackgroundObject> registry = new HashMap<>();

    //no args constructor
    PrototypeRegistry(){}

    //Setter
    //method to register to object, take object and store in registry
    //take argument type/add logic here itself
    //generic registry pass type
    //specific registry to BGObjects/Graphical objects then add code in method itself
    public void register(BackgroundObject object){
        registry.put(object.getType(), object);
    }

    //Getter
    public BackgroundObject getPrototype(BackgroundObjectType type){
        return registry.get(type);
    }

    //redundant object
    public BackgroundObject clone(BackgroundObjectType type){
        BackgroundObject prototype = getPrototype(type);
        return prototype.clone();
    }
}

