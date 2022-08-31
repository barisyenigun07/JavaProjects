package CENG211_HW4;

import java.util.Scanner;

public class CustomerComplaintApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To The Customer Complaint App!");
        System.out.println("[1] Login\n" +
                           "[2] Sign Up");
        System.out.print("Login or Sign Up:");
        String answer = scanner.nextLine();
        if (answer.equals("1")){
            Login login = new Login();
            User user = login.getUser();
            if (user == null){
                System.out.println("User Not Found!");
            }
            else if (user instanceof Admin){
                Admin admin = (Admin) user;
                System.out.println("Welcome " + admin + "!");
                admin.seeComplaints();
            }
            else if (user instanceof Customer){
                Customer customer = (Customer) user;
                System.out.println("Welcome " + customer + "!");
                System.out.println("[1] Add Complaint\n" +
                                   "[2] See Previous Complaints");
                System.out.print("Option:");
                String option = scanner.nextLine();
                if (option.equals("1")){
                    customer.addComplaint();
                }
                else if (option.equals("2")){
                    customer.seeComplaints();
                }
                else{
                    System.out.println("Invalid Option!");
                }
            }
            else if (user instanceof Producer){
                Producer producer = (Producer) user;
                System.out.println("Welcome " + producer + "!");
                System.out.println("[1] Add Product\n" +
                                   "[2] See Complaints");
                System.out.print("Option:");
                String option = scanner.nextLine();
                if (option.equals("1")){
                    producer.addProduct();
                }
                else if (option.equals("2")){
                    producer.seeComplaints();
                }
                else{
                    System.out.println("Invalid Option!");
                }
            }
        }
        else if (answer.equals("2")){
            Registration registration = new Registration();
            registration.registerUser();
        }
        else{
            System.out.println("Invalid Option!");
        }
    }
}