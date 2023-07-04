import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
    public static void main(String[] args) {
        String name = "Alex";
        int sal = 34000;
        String email = "alex@gmail.com";
        String mobile = "1212121212";
        String status = "Active";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ntpl", "root", "");
            Statement st =  con.createStatement();
            String query = "insert into employees (name,sal,email,mobile,status) values ('"+name+"','"+sal+"','"+email+"','"+mobile+"','"+status+"')";            
            int affectedRows = st.executeUpdate(query);
            if(affectedRows > 0) {
                System.out.println("Row inserted successfully");
            }else {
                System.out.println("No row created");
            }

            st.close();
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
