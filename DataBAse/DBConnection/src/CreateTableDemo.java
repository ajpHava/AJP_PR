

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {
    public static void main(String[] args) {
        try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql:///ajp_pr" , "root" , "" );
			Statement statement = connection.createStatement();
			statement.executeUpdate("create table emp(empID int(10),empName varchar(30));");
			System.out.println("Table created successfully");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }    
}
