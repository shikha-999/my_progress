public class ConnectionPool {
    //step3: Add static local field
    private static ConnectionPool INSTANCE = new ConnectionPool();
    //step1 : private constructor / constructor hiding
    private ConnectionPool() {}

    //step2: Create global access point / Static initializer
    public static ConnectionPool getInstance(){  //method using common variable(Critical Section)
        return INSTANCE;
    }
}
