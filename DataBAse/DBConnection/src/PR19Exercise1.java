import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PR19Exercise1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql:///AJP_PR", "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Roll No \t Name \t\t Perecentage" );
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getInt(3));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
