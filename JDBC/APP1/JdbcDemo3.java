import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo3 {
    public static void main(String[] args) {
        String name = "Clark";
        int sal = 30000;
        String email = "clark@gmail.com";
        String mobile = "1212121213";
        String status = "Active";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Max login time: "+ DriverManager.getLoginTimeout());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ntpl", "root", "");
            String query = "insert into employees (name,sal,email,mobile,status) values (?,?,?,?,?)";            

            PreparedStatement pst =  con.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, sal);
            pst.setString(3, email);
            pst.setString(4, mobile);
            pst.setString(5, status);

            int affectedRows = pst.executeUpdate();
            if(affectedRows > 0) {
                System.out.println("Row inserted successfully");
            }else {
                System.out.println("No row created");
            }

            pst.close();
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
