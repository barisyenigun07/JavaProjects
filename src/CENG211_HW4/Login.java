package CENG211_HW4;

import java.util.ArrayList;
import java.util.Scanner;

public class Login implements ILogin{
    private String userName;
    private String password;
    private ArrayList<User> users;
    public Login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username:");
        userName = scanner.nextLine();
        System.out.print("Password:");
        password = scanner.nextLine();
        users = new Database().getUserList();
    }

    @Override
    public User getUser() {
        User user = null;
        for (User u : users){
            if (userName.equals(u.getUserName()) && password.equals(u.getPassword())){
                user = u;
                break;
            }
        }
        return user;
    }
}
