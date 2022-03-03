package session17.user_data_migration;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveUser {
    public static void main(String... args) {
        try (FileOutputStream fout = new FileOutputStream("session17/user_data_migration/userdata.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);) {
         
            User user = new User("Deepak", "dee@gmail.com", "555");
            
            out.writeObject(user);
            
            out.flush();
            System.out.println("user record saved");
        } catch (Exception e) {
            System.out.println("user record not saved!!!");
            System.out.println(e);
        }
    }
}
