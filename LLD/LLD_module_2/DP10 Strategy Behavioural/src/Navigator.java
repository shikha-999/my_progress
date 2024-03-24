import lombok.AllArgsConstructor;
import java.util.List;

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

    //method overloading - argument type changed / or in interface
    public void navigate(List<String> from, List<String> to){
        for(int i = 0; i < from.size(); i++){
            navigationStrategy.navigate(from.get(i), to.get(i));
        }
    }
}
