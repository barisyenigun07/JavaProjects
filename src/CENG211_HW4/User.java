package CENG211_HW4;

public abstract class User {
    private int userId;
    private String userName;
    private String password;
    private String displayedName;
    private String userType;

    public User(int userId,String userName,String password,String displayedName,String userType){
        this.setUserId(userId);
        this.setUserName(userName);
        this.setPassword(password);
        this.setDisplayedName(displayedName);
        this.setUserType(userType);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayedName() {
        return displayedName;
    }

    public void setDisplayedName(String displayedName) {
        this.displayedName = displayedName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public abstract void seeComplaints();

    public String toString(){
        return displayedName;
    }

}