import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Result {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql:///ajp_pr","root","");
			Statement statement = connection.createStatement();
			statement.executeUpdate("drop table student");
			statement.executeUpdate("create table student(rollNo int(10),studentName varchar(30),percentage int(3));");
			System.out.println("Studnet Table Created");
			statement.executeUpdate("insert into student values('12','Tushar','88');");
			statement.executeUpdate("insert into student values('20','Prathmesh','10');");
			statement.executeUpdate("insert into student values('6','Atharva','85');");
			statement.executeUpdate("insert into student values('18','Aditya','20');");
			ResultSet resultSet =  statement.executeQuery("select rollno,studentname from student where percentage >70 ");
			System.out.println("Roll No \t Name");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2));
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
