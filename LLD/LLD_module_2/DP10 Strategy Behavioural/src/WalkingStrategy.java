//step 2: create concrete strategies
public class WalkingStrategy implements NavigationStrategy{
    @Override
    public void navigate(String from, String to) {
        System.out.println("Navigating using the walking mode");
    }
}
