// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");

        //creating a parallel running thread
        //step1 : create instance of task
        //creating cars to pass
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        //step 2 : put task instance in object of thread class
        //creating a lane(passing car into lane)
        Thread thread = new Thread(helloWorldPrinter);

        //step 3 : start/run the thread
        thread.start();

        System.out.println("3");
        System.out.println("4");
    }
}