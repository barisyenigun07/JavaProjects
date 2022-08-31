package CENG211_HW3;

public abstract class Ecommerce<T> extends CargoPackage<T> implements IEcommerce{
    private String siteName;
    private int dailyPackageLimit;
    private String status;

    public Ecommerce(String type,String siteName,T cargoCode,int weight,int width,int length,int height,int dailyPackageLimit){
        super(type, weight, width, length, height,cargoCode);
        this.setSiteName(siteName);
        this.setCargoCode(cargoCode);
        this.setDailyPackageLimit(dailyPackageLimit);
        if (!this.getDeliveryDay().equals("NO DELIVERY")){
            this.setStatus("Accepted");
        }
        else{
            this.setStatus("Not Accepted");
        }
    }

    public String getSiteName() {
        return siteName;
    }
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }
    public int getDailyPackageLimit() {
        return dailyPackageLimit;
    }
    public void setDailyPackageLimit(int dailyPackageLimit) {
        this.dailyPackageLimit = dailyPackageLimit;
    }
    @Override
    public abstract boolean checkCargoCode() throws InvalidCodeException;

    @Override
    public void checkStatus(int packageNum) {
        int dailyLimit = getDailyPackageLimit();
        if (dailyLimit < packageNum){
            this.setStatus("Not Accepted");
        }
    }

}
