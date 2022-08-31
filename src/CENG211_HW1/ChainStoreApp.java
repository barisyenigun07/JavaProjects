package CENG211_HW1;

public class ChainStoreApp {
    public static void main(String[] args){
        StoreQuery storeQuery = new StoreQuery();
        System.out.println("Welcome To Chain Store App");
        System.out.println("****************************************************************");
        System.out.println("The Most Profitable Item: " + storeQuery.getMostProfitableItem());
        System.out.println("The Most Profitable Category: " + storeQuery.getMostProfitableCategory());
        System.out.println("The Least Profitable Item: " + storeQuery.getLeastProfitableItem());
        System.out.println("The Least Profitable Category: " + storeQuery.getLeastProfitableCategory());
        System.out.println("The Most Profitable Item For A Single Sale: " + storeQuery.getMostProfitableItemForASingleSale());
        System.out.println("The Best Selling Item: " + storeQuery.getBestSellingItem());
        System.out.println("****************************************************************");
        System.out.println("The Most Profitable Stores For Each Month:");
        storeQuery.printMostProfitableStoreOfEveryMonth();
        System.out.println("****************************************************************");
    }
}
