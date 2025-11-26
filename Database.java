// In this program we connecting data with database(MySql).

package bank.management.System;
import java.sql.*;

public class Database {
    Connection connection;
    Statement statement;

    public Database(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","Mdkaif@1234");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}


