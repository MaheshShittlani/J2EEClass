package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import business.User;

public class UserModel {
    public static void addUser(User user, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        PrintWriter out = new PrintWriter(fileWriter, true);

        out.println(user.getEmail()+"|"+user.getFirstname()+"|"+user.getLastname());
        out.close();
    }
}
