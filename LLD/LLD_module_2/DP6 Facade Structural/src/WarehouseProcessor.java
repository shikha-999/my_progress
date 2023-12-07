public class WarehouseProcessor {
    private InventoryService inventoryService = new InventoryService();
    private AnalyticsService analyticsService = new AnalyticsService() ;

    public void process(){
        inventoryService.checkInventory();
        analyticsService.track();
    }
}
