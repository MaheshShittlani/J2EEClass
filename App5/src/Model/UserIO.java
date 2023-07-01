package Model;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Business.User;

public class UserIO {
    public static void addUser(User user , String filepath) throws IOException  {
        FileWriter fileWriter = new FileWriter(filepath, true);
        PrintWriter out = new PrintWriter(fileWriter);

        out.println(user.getEmail()+"|"+user.getFirstname()+"|"+user.getLastname());

        out.close();
    }
}
