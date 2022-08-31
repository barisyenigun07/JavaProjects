package CENG211_HW1;

public class StoreQuery {
    private Helper helper;
    private ItemTransaction[] itemTransactions;

    public StoreQuery() {
        helper = new Helper();
        AnnualSale annualSale = helper.makeAnnualSale();
        itemTransactions = annualSale.getItemTransactions();
    }
    public String getMostProfitableItem() {
        Item[] items = new Item[itemTransactions.length];
        double[] profits = new double[itemTransactions.length];
        for (int i = 0; i < itemTransactions.length; i++) {
            items[i] = itemTransactions[i].getItem();
            Transaction[][] transactions = itemTransactions[i].getTransactions();
            profits[i] = helper.calculateTotalProfit(transactions);
        }
        return items[helper.getMaxProfitIndex(profits)].getName();
    }
    public String getMostProfitableCategory() {
        double profitBeverage = 0, profitFood = 0, profitSnack = 0, profitHome = 0, profitPersonal = 0;
        int numOfBeverage = 0, numOfFood = 0, numOfSnack = 0, numOfHome = 0, numOfPersonal = 0;
        Item[] items = new Item[itemTransactions.length];
        for (int i = 0; i < itemTransactions.length; i++){
            items[i] = itemTransactions[i].getItem();
            Transaction[][] transactions = itemTransactions[i].getTransactions();
            if (items[i].getCategory().equals("Beverage")){
                numOfBeverage++;
                profitBeverage += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Food")){
                numOfFood++;
                profitFood += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Snack")){
                numOfSnack++;
                profitSnack += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Home")){
                numOfHome++;
                profitHome += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Personal")){
                numOfPersonal++;
                profitPersonal += helper.calculateTotalProfit(transactions);
            }
        }
        double profitPerBeverage = profitBeverage / numOfBeverage;
        double profitPerFood = profitFood / numOfFood;
        double profitPerSnack = profitSnack / numOfSnack;
        double profitPerHome = profitHome / numOfHome;
        double profitPerPersonal = profitPersonal / numOfPersonal;
        double[] profitsPerCategory = {profitPerBeverage,profitPerFood,profitPerSnack,profitPerHome,profitPerPersonal};
        if (helper.getMaxProfitIndex(profitsPerCategory) == 0){
            return "Beverage";
        }
        else if (helper.getMaxProfitIndex(profitsPerCategory) == 1){
            return "Food";
        }
        else if (helper.getMaxProfitIndex(profitsPerCategory) == 2){
            return "Snack";
        }
        else if (helper.getMaxProfitIndex(profitsPerCategory) == 3){
            return "Home";
        }
        else if (helper.getMaxProfitIndex(profitsPerCategory) == 4){
            return "Personal";
        }
        else{
            return null;
        }
    }
    public String getLeastProfitableItem(){
        Item[] items = new Item[itemTransactions.length];
        double[] profits = new double[itemTransactions.length];
        for (int i = 0;i < itemTransactions.length;i++){
            items[i] = itemTransactions[i].getItem();
            Transaction[][] transactions = itemTransactions[i].getTransactions();
            profits[i] = helper.calculateTotalProfit(transactions);
        }
        return items[helper.getMinProfitIndex(profits)].getName();
    }
    public String getLeastProfitableCategory(){
        double profitBeverage = 0,profitFood = 0,profitSnack = 0,profitHome = 0,profitPersonal = 0;
        int numOfBeverage = 0,numOfFood = 0,numOfSnack = 0,numOfHome = 0,numOfPersonal = 0;
        Item[] items = new Item[itemTransactions.length];
        for (int i = 0;i < itemTransactions.length;i++) {
            items[i] = itemTransactions[i].getItem();
            Transaction[][] transactions = itemTransactions[i].getTransactions();
            if (items[i].getCategory().equals("Beverage")){
                numOfBeverage++;
                profitBeverage += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Food")){
                numOfFood++;
                profitFood += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Snack")){
                numOfSnack++;
                profitSnack += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Home")){
                numOfHome++;
                profitHome += helper.calculateTotalProfit(transactions);
            }
            else if (items[i].getCategory().equals("Personal")){
                numOfPersonal++;
                profitPersonal += helper.calculateTotalProfit(transactions);
            }
        }
        double profitPerBeverage = profitBeverage / numOfBeverage;
        double profitPerFood = profitFood / numOfFood;
        double profitPerSnack = profitSnack / numOfSnack;
        double profitPerHome = profitHome / numOfHome;
        double profitPerPersonal = profitPersonal / numOfPersonal;
        double[] profitsPerCategory = {profitPerBeverage,profitPerFood,profitPerSnack,profitPerHome,profitPerPersonal};
        if (helper.getMinProfitIndex(profitsPerCategory) == 0){
            return "Beverage";
        }
        else if (helper.getMinProfitIndex(profitsPerCategory) == 1){
            return "Food";
        }
        else if (helper.getMinProfitIndex(profitsPerCategory) == 2){
            return "Snack";
        }
        else if (helper.getMinProfitIndex(profitsPerCategory) == 3){
            return "Home";
        }
        else if (helper.getMinProfitIndex(profitsPerCategory) == 4){
            return "Personal";
        }
        else{
            return null;
        }
    }
    public String getMostProfitableItemForASingleSale(){
        Item[] items = new Item[itemTransactions.length];
        double[] profitsPerSale = new double[itemTransactions.length];
        for (int i = 0;i < itemTransactions.length;i++){
            items[i] = itemTransactions[i].getItem();
            Transaction[][] transactions = itemTransactions[i].getTransactions();
            profitsPerSale[i] = (helper.calculateTotalProfit(transactions) / helper.getTotalNumberOfSales(transactions));
        }
        return items[helper.getMaxProfitIndex(profitsPerSale)].getName();
    }
    public String getBestSellingItem(){
        Item[] items = new Item[itemTransactions.length];
        int[] numberOfSales = new int[itemTransactions.length];
        for (int i = 0;i < itemTransactions.length;i++){
            items[i] = itemTransactions[i].getItem();
            Transaction[][] transactions = itemTransactions[i].getTransactions();
            numberOfSales[i] = helper.getTotalNumberOfSales(transactions);
        }
        return items[helper.getBestSellingItemIndex(numberOfSales)].getName();
    }
    public void printMostProfitableStoreOfEveryMonth(){
        Transaction[][] transactions1 = helper.keepTransactionsOfAStore("src/HW1_Transactions_Store1.csv");
        Transaction[][] transactions2 = helper.keepTransactionsOfAStore("src/HW1_Transactions_Store2.csv");
        Transaction[][] transactions3 = helper.keepTransactionsOfAStore("src/HW1_Transactions_Store3.csv");
        Transaction[][] transactions4 = helper.keepTransactionsOfAStore("src/HW1_Transactions_Store4.csv");
        for (int i = 0;i < 12;i++){
            double[] monthlyProfitsOfEveryStore = {helper.calculateTotalProfitOfAMonth(transactions1,i),
                                                   helper.calculateTotalProfitOfAMonth(transactions2,i),
                                                   helper.calculateTotalProfitOfAMonth(transactions3,i),
                                                   helper.calculateTotalProfitOfAMonth(transactions4,i)};
            System.out.println("The Most Profitable Store Of Month " + (i + 1) + " : " + "Store " + (helper.getMaxProfitIndex(monthlyProfitsOfEveryStore) + 1));
        }
    }
}