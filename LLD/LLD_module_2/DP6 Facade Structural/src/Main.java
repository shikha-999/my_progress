// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //create order
    private static OrderFlowProcessor orderFlowProcessor = new OrderFlowProcessor();
    public static void main(String[] args) {
        //facade design pattern for complicated sub-system
        //create a high level interface that makes usage very simple
        //simply creates new class, that encapsulates complex logic
        //facade->hides different variety,flow, logic in 1 class
        //frontend looks clean
        //but process()-> is complicated
        orderFlowProcessor.process();
    }
}