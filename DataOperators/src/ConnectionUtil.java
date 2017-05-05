
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionUtil
{
 public static Connection getConnection() throws SQLException
 {
 Connection connection = null;
 try
 {
 Class.forName("com.mysql.jdbc.Connection");
 connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test",
 "root", "system");
 }
 catch (ClassNotFoundException e)
 {
 e.printStackTrace();
 }
 catch (SQLException e)
 {
 e.printStackTrace();
 }
 return connection;
}
 }

