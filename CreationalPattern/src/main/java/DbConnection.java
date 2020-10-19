import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private static final String DB_DRIVER="org.h2.Driver";
    private static final String DB_CONNECTION="jdbc:h2:~/test";
    //DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

    private static final String DB_USER="sa";
    private static final String DB_PASSWORD="";
    private Connection connection;
           // =new DbConnection(); eager singelton
    private DbConnection(){
        initialConnection();

    }
    //not threadsafe
/*
    public static  synchronized DbConnection getInstance(){
        if (dbConnection==null){
            dbConnection= new DbConnection();

        }
        return dbConnection;
    }*/
/// thread safe but function is synchronized
/*
    public static  DbConnection getInstance(){
        if (dbConnection==null){
            dbConnection= new DbConnection();

        }
        return dbConnection;
    }*/


    public static  DbConnection getInstance() {
        if (dbConnection==null){
            synchronized (DbConnection.class){
        if (dbConnection == null) {
            dbConnection = new DbConnection();

        }}
    }
        return dbConnection;
    }
    public void initialConnection(){
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {
            connection= DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
            throwables.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
