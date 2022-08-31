package CENG211_HW4;

import java.io.*;
import java.util.*;

public class Registration implements IRegistration {
    private User user;
    private ArrayList<User> users;


    public Registration(){
        Scanner scanner = new Scanner(System.in);
        int userId = new Random().nextInt(100) + 1;
        System.out.print("Username:");
        String userName = scanner.nextLine();
        System.out.print("Password:");
        String password = scanner.nextLine();
        System.out.print("Displayed Name:");
        String displayedName = scanner.nextLine();
        System.out.print("User Type (customer(1)/producer(2)):");
        String userType = scanner.nextLine();
        if (userType.equals("1")){
            user = new Customer(userId,userName,password,displayedName);
        }
        else if (userType.equals("2")){
            user = new Producer(userId,userName,password,displayedName);
        }
        else{
            user = null;
        }
        users = new Database().getUserList();
        
    }
    @Override
    public boolean checkUserId() {
        boolean isOk = true;
        if (user == null){
            isOk = false;
        }
        else{
            for (User u : users){
                if (user.getUserId() == u.getUserId()){
                    isOk = false;
                    break;
                }
            }
        }
        return isOk;
    }

    @Override
    public boolean checkUserName() {
        boolean isOk = true;
        if (user == null){
            isOk = false;
        }
        else{
            for (User u : users){
                if (user.getUserName().equals(u.getUserName())){
                    isOk = false;
                    break;
                }
            }
        }
        return isOk;
    }

    @Override
    public boolean checkPassword() {
        boolean isOk = true;
        if (user == null){
            isOk = false;
        }
        else{
            for (User u : users){
                if (user.getPassword().equals(u.getPassword())){
                    isOk = false;
                    break;
                }
            }
        }
        return isOk;
    }



    @Override
    public void registerUser() {
        if (checkUserName() && checkPassword()){
            while (!checkUserId()){
                user.setUserId(new Random().nextInt(100) + 1);
            }
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/User.csv",true))){
                writer.write(user.getUserId() + "," + user.getUserName() + "," + user.getPassword() + "," + user.getDisplayedName() + "," + user.getUserType() + "\n");
            } catch (IOException e) {
                System.out.println("Error!");
            }
        }
        else{
            System.out.println("Sign Up process has failed!");
            System.out.println("Warning: You may have entered similar credentials to credentials which are in our database or your user type may be improper!");
        }
    }
}
