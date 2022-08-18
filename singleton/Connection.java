package pattern.design.singleton;

/**
 * Created by User on 18-Aug-22.
 */
public class Connection {


    private static final Connection connection = new Connection();

    private Connection() {
    }

    public static Connection getInstance(){

        return connection;
    }

    public void showInfo(){
        System.out.println("Hello form singleton class");
    }
}
