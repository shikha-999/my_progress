import lombok.AllArgsConstructor;
//step 3: modify the context class
//class that calls the strategy
@AllArgsConstructor
public class Navigator {
    //a. add a local variable for strategy
    //filled by all args (object) constructor
    private NavigationStrategy navigationStrategy;
    public void navigate(String from, String to){
        //b. under navigate() -> just delegate the calls
        navigationStrategy.navigate(from, to);
    }
}
