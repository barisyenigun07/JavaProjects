package CENG211_HW4;
import java.util.ArrayList;

public class Database {
    private String[][] fUsers;
    private String[][] fProducts;
    private String[][] fComplaints;

    public Database(){
        FileIO fileIO = new FileIO();
        fUsers = fileIO.readValues("src/User.csv");
        fProducts = fileIO.readValues("src/Product.csv");
        fComplaints = fileIO.readValues("src/Complaint.csv");
    }

    public ArrayList<User> getUserList(){
        ArrayList<User> users = new ArrayList<>();
        for (String[] fUser : fUsers) {
            int userId = Integer.parseInt(fUser[0]);
            String userName = fUser[1];
            String password = fUser[2];
            String displayedName = fUser[3];
            String userType = fUser[4];
            if (userType.equals("customer")){
                User customer = new Customer(userId,userName,password,displayedName);
                users.add(customer);
            }
            else if (userType.equals("producer")){
                User producer = new Producer(userId,userName,password,displayedName);
                users.add(producer);
            }
            else if (userType.equals("admin")){
                User admin = new Admin(userId,userName,password,displayedName);
                users.add(admin);
            }
        }
        return users;
    }
    public ArrayList<Customer> getCustomerList(){
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<User> users = getUserList();
        for (User u : users){
            if (u instanceof Customer){
                customers.add((Customer) u);
            }
        }
        return customers;
    }
    public ArrayList<Producer> getProducerList(){
        ArrayList<Producer> producers = new ArrayList<>();
        ArrayList<User> users = getUserList();
        for (User u : users){
            if (u instanceof Producer){
                producers.add((Producer) u);
            }
        }
        return producers;
    }
    public ArrayList<Product> getProductList(){
        ArrayList<Product> products = new ArrayList<>();
        for (String[] fProduct : fProducts) {
            int productId = Integer.parseInt(fProduct[0]);
            Producer producer = new Helper().getProducer(Integer.parseInt(fProduct[1]));
            String productName = fProduct[2];
            String productType = fProduct[3];
            Product product = new Product(productId,producer,productName,productType);
            products.add(product);
        }
        return products;
    }
    public ArrayList<String> getProductTypeList(){
        ArrayList<String> productTypes = new ArrayList<>();
        ArrayList<Product> products = getProductList();
        for (Product product : products){
            if (!productTypes.contains(product.getProductType())){
                productTypes.add(product.getProductType());
            }
        }
        return productTypes;
    }
    public ArrayList<Complaint> getComplaintList(){
        ArrayList<Complaint> complaints = new ArrayList<>();
        for (String[] fComplaint : fComplaints){
            int complaintId = Integer.parseInt(fComplaint[0]);
            Customer customer = new Helper().getCustomer(Integer.parseInt(fComplaint[1]));
            Product product = new Helper().getProduct(Integer.parseInt(fComplaint[3]));
            String complaintTitle = fComplaint[4];
            String complaintContent = fComplaint[5];
            String status = fComplaint[6];
            Complaint complaint = new Complaint(complaintId,customer,product,complaintTitle,complaintContent,status);
            complaints.add(complaint);
        }
        return complaints;
    }


}
