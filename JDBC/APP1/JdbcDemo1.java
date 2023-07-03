import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String connectionURL = "jdbc:mysql://localhost:3306/lms";
        String username = "root";
        String password = "";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectionURL, username , password);
            Statement st = con.createStatement();
            String query = "select * from authors";
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                System.out.println(rs.getInt("id")+" "
                + rs.getString("name")+" "
                + rs.getString("last_modified_at"));
            }

            rs.close();
            st.close();
            con.close();
        } 
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        } 


    }
}