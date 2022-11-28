import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String studentNameString =  "";
		int rollNo = 0 ;
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql:///AJP_PR","","");
			PreparedStatement preparedStatement = connection.prepareStatement("update student set studentName=(?) where rollNo=(?)");
			System.out.println("Enter the student Roll no : ");
			rollNo = scanner.nextInt();
			System.out.println("Enter the student name : ");
			studentNameString = scanner.next();
			
			preparedStatement.setString(1, studentNameString);
			preparedStatement.setInt(2, rollNo);
			
			int rowUpdate = preparedStatement.executeUpdate();
			
			if (rowUpdate!=0) {
				System.out.println("Studnet Name Updated");
			} else {
				System.out.println("Student Name not Updated");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
