import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.*;

public class DbConnectionTest {

    @Test
    public void getInstance() {
        DbConnection dbConnection=DbConnection.getInstance();
        Connection connection=dbConnection.getConnection();
        DatabaseMetaData dbm = null;
        try {
            dbm = connection.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
// check if "employee" table is there
        ResultSet tables = null;
        try {
            tables = dbm.getTables(null, null, "PERSONS", null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (tables.next()) {
                // Table exists
            }
            else {
                // Table does not exist
                String sql = "DROP TABLE Persons ";
                connection.createStatement().executeUpdate(sql);
                String creatQuery=
                        "CREATE TABLE Persons (ID int,LastName varchar(255));";
                try (Statement statement=connection.createStatement()){
                    statement.execute(creatQuery);
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String insertQuery="insert into Persons(ID,LastName) values(?,?) ";
            try(PreparedStatement preparedStatement=connection.prepareStatement(insertQuery)){
                        preparedStatement.setInt(1,1);
                        preparedStatement.setString(2,"milad");
                        preparedStatement.executeUpdate();

                preparedStatement.setInt(1,2);
                preparedStatement.setString(2,"hosain");
                preparedStatement.executeUpdate();
            }catch (SQLException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            String selectQuery="select count(*) from Persons";
            try(Statement statement=connection.createStatement()){
                try(ResultSet resultSet=statement.executeQuery(selectQuery)){
                    if(resultSet.next()) {
                        System.out.println("???????????????/");
                        System.out.println(resultSet.getInt(1));
                        Assert.assertEquals(resultSet.getInt(1),2);
                    }
                }
            }catch (SQLException e){}
    }
    @Test
    public void getInstancePerformance(){
        long time=System.currentTimeMillis();
        System.out.println(DbConnection.getInstance()+"    ");
        System.out.println(System.currentTimeMillis()-time);


         time=System.currentTimeMillis();
        System.out.println(DbConnection.getInstance()+"    ");
        System.out.println(System.currentTimeMillis()-time);

    }
}