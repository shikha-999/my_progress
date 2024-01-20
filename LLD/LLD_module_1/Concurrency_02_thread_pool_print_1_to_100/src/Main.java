import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        for(int i=1; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
//        for(int i=-1; i>=-10; i--){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executorService1.execute(numberPrinter);
//        }
    }
}