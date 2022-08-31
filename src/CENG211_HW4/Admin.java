package CENG211_HW4;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    public Admin(int userId,String userName,String password,String displayedName){
        super(userId,userName, password, displayedName,"admin");
    }
    @Override
    public void seeComplaints(){
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        Database database = new Database();
        ArrayList<Complaint> complaints = database.getComplaintList();
        if (!complaints.isEmpty()){
            for (Complaint complaint : complaints){
                System.out.println(complaint.getComplaintId() + "," + complaint.getCustomer() + "," + complaint.getProducer() + "," + complaint.getProduct() + "," + complaint.getTitle() + "," + complaint.getStatus());
            }
            System.out.print("Enter title of complaint which you are looking for:");
            String title = scanner.nextLine();
            Complaint complaint = helper.findComplaint(complaints,title);
            if (complaint != null){
                System.out.println("Complaint: " + complaint.getComplaint());
                System.out.print("Do you want to change its status(y/n)?:");
                String answer = scanner.nextLine();
                if (answer.equals("y")){
                    System.out.println("[1] New\n" +
                            "[2] Seen\n" +
                            "[3] Working\n" +
                            "[4] Fixed");
                    System.out.print("Select status:");
                    String option = scanner.nextLine();
                    if (option.equals("1")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("new");
                    }
                    else if (option.equals("2")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("seen");
                    }
                    else if (option.equals("3")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("working");
                    }
                    else if (option.equals("4")){
                        complaints.get(helper.findIndexOfComplaint(complaints,complaint)).setStatus("fixed");
                    }
                    else{
                        System.out.println("Invalid Option!");
                    }
                    helper.updateComplaintList(complaints);
                }
                else if (answer.equals("n")){
                    System.out.println("Task has finished!");
                }
                else{
                    System.out.println("Invalid Option!");
                }
            }
            else{
                System.out.println("Complaint Not Found!");
            }
        }
        else{
            System.out.println("There are no complaints in the system!");
        }
    }
}
