public class OrderFlowProcessor {
    private PaymentService paymentService = new PaymentService();
    private WarehouseProcessor warehouseProcessor = new WarehouseProcessor();
    private RecommendationService recommendationService = new RecommendationService();
    public void process(){
        //order something
        //pay
        paymentService.pay();
        //update and analytics in warehouse
        warehouseProcessor.process();;
        //recommendations
        recommendationService.recommend();
    }
}
