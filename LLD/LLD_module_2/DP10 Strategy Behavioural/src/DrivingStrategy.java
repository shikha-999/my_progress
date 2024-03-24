public class DrivingStrategy implements NavigationStrategy{
    @Override
    public void navigate(String from, String to) {
        //reused method of parent class
        start();
        System.out.println("Navigating using the car mode");
        stop();
    }
}
