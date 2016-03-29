import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) 
	{
		//very simple test I made today to figure out how to connect to the database
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
			Statement s=con.createStatement();
			//use s.executeQuery("SQL statement"); to execute statements on the database
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
