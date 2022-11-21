import java.sql.*;
public class JdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			String urlString = "jdbc:mysql:///AJP_PR";
			Connection connection = DriverManager.getConnection(urlString,"root","");
			System.out.println("Connection Established");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("Select * from student");
			System.out.println("Roll No \t Name");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2));
			}
			
		
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
