public class ConnectionPool {
    //step3: Add static local field
    private static ConnectionPool INSTANCE = null;
    //step1 : private constructor / constructor hiding
    private ConnectionPool() {}

    //step2: Create global access point / Static initializer
    public static synchronized ConnectionPool getInstance(){  //method using common variable(Critical Section)
        if(INSTANCE == null){
            //create new instance and store
            INSTANCE =  new ConnectionPool();
        }
        return INSTANCE;
    }
}
