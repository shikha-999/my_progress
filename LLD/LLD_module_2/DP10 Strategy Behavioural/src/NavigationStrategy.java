public interface NavigationStrategy {
    //no rule for same method - can use diff method name
    //but convenient for same method name - easily delegate calls
    //we dont need types,diff concrete implementations for each type
    void navigate(String from, String to);

    //common methods - only Default keyword - reusable functionalities
    default void start(){
        System.out.println("starting");
    }
    default void stop(){
        System.out.println("stopping");
    }
}
