public class Runner {
    public static void main(String[] args) {
        //cant create object of ConnectionPool
        //ConnectionPool connectionPool = new ConnectionPool();

        ConnectionPool connectionPool1 = ConnectionPool.getInstance();
        ConnectionPool connectionPool2 = ConnectionPool.getInstance();
        ConnectionPool connectionPool3 = ConnectionPool.getInstance();

        System.out.println(connectionPool1 == connectionPool2); //true
        System.out.println(connectionPool1 == connectionPool3);
    }
}
