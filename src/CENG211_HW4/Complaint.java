package CENG211_HW4;

public class Complaint {
    private int complaintId;
    private Customer customer;
    private Producer producer;
    private Product product;
    private String title;
    private String complaint;
    private String status;

    public Complaint(int complaintId,Customer customer,Product product,String title,String complaint,String status){
        this.setComplaintId(complaintId);
        this.setCustomer(customer);
        this.setProducer(product.getProducer());
        this.setProduct(product);
        this.setTitle(title);
        this.setComplaint(complaint);
        this.setStatus(status);
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Producer getProducer(){
        return producer;
    }

    public void setProducer(Producer producer){
        this.producer = producer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
