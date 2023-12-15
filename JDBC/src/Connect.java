import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private  static Connection con;
    static {
        try{
           // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");

        }
        catch(SQLException e){
            System.out.println(e.getErrorCode());
        }
    }
    public static  Connection getCon(){
        return con;
    }
}
