public class NumberPrinter implements Runnable{
    private int num;
    NumberPrinter(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println(num + " by " + Thread.currentThread().getName());
    }
}
