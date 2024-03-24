public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hellow World 1 "+Thread.currentThread().getName());
        System.out.println("Hellow World 2 "+Thread.currentThread().getName());
    }
}
