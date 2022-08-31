package CENG211_HW1;

public class Helper {
    private FileIO fileIO;

    public Helper() {
        fileIO = new FileIO();
    }

    private Item[] makeItems() {
        String[][] fItems = fileIO.getItems();
        Item[] items = new Item[fItems.length];
        for (int i = 0; i < fItems.length; i++) {
            String name = fItems[i][0];
            int id = Integer.parseInt(fItems[i][1]);
            String category = fItems[i][2];
            Item item = new Item(id, name, category);
            items[i] = item;
        }
        return items;
    }

    private Transaction[] makeTransactions(String[] array) {
        Transaction[] transactions = new Transaction[12];
        int length = array.length;
        int i = 1;
        String[][] temp2DArr = new String[12][3];
        while (i < length) {
            for (int j = 0; j < temp2DArr.length; j++) {
                for (int k = 0; k < temp2DArr[j].length; k++) {
                    temp2DArr[j][k] = array[i];
                    i++;
                }
            }
        }
        for (int m = 0; m < temp2DArr.length; m++) {
            double purchasePrice = Double.parseDouble(temp2DArr[m][0]);
            double salePrice = Double.parseDouble(temp2DArr[m][1]);
            int numberOfSales = Integer.parseInt(temp2DArr[m][2]);
            transactions[m] = new Transaction(purchasePrice, salePrice, numberOfSales);
        }
        return transactions;
    }

    private Transaction[][] makeTransactionsOfAnItem(String[] files, int index) {
        Transaction[][] transactions = new Transaction[files.length][];
        int i = 0;
        while (i < files.length) {
            String[][] fTransactions = fileIO.getTransactions(files[i]);
            transactions[i] = makeTransactions(fTransactions[index]);
            i++;
        }
        return transactions;
    }

    public Transaction[][] keepTransactionsOfAStore(String file) {
        String[][] fTransactions = fileIO.getTransactions(file);
        Transaction[][] transactions = new Transaction[fTransactions.length][];
        for (int i = 0; i < fTransactions.length; i++) {
            transactions[i] = makeTransactions(fTransactions[i]);
        }
        return transactions;
    }

    public AnnualSale makeAnnualSale() {
        String[] files = {"src/HW1_Transactions_Store1.csv", "src/HW1_Transactions_Store2.csv", "src/HW1_Transactions_Store3.csv", "src/HW1_Transactions_Store4.csv"};
        Item[] items = makeItems();
        ItemTransaction[] itemTransactions = new ItemTransaction[items.length];
        for (int i = 0; i < items.length; i++) {
            Transaction[][] transactions = makeTransactionsOfAnItem(files, items[i].getId() - 1);
            itemTransactions[i] = new ItemTransaction(items[i], transactions);
        }
        return new AnnualSale(itemTransactions);
    }

    public int getMaxProfitIndex(double[] profits) {
        int index = 0;
        double maxProfit = profits[0];
        for (int i = 1; i < profits.length; i++) {
            if (profits[i] > maxProfit) {
                maxProfit = profits[i];
                index = i;
            }
        }
        return index;
    }

    public int getMinProfitIndex(double[] profits) {
        int index = 0;
        double minProfit = profits[0];
        for (int i = 1; i < profits.length; i++) {
            if (profits[i] < minProfit) {
                minProfit = profits[i];
                index = i;
            }
        }
        return index;
    }

    public int getBestSellingItemIndex(int[] numberOfSales) {
        int index = 0;
        int bestSelling = numberOfSales[0];
        for (int i = 1; i < numberOfSales.length; i++) {
            if (numberOfSales[i] > bestSelling) {
                bestSelling = numberOfSales[i];
                index = i;
            }
        }
        return index;
    }

    private double calculateProfit(Transaction transaction) {
        return (transaction.getSalePrice() - transaction.getPurchasePrice()) * transaction.getNumberOfSales();
    }

    public double calculateTotalProfit(Transaction[][] transactions) {
        double totalProfit = 0;
        for (int i = 0; i < transactions.length; i++) {
            for (int j = 0; j < transactions[i].length; j++) {
                totalProfit += calculateProfit(transactions[i][j]);
            }
        }
        return totalProfit;
    }

    public double calculateTotalProfitOfAMonth(Transaction[][] transactions, int index) {
        double profitOfMonth = 0;
        for (int i = 0; i < transactions.length; i++) {
            profitOfMonth += calculateProfit(transactions[i][index]);
        }
        return profitOfMonth;
    }

    public int getTotalNumberOfSales(Transaction[][] transactions) {
        int numberOfSales = 0;
        for (int i = 0; i < transactions.length; i++) {
            for (int j = 0; j < transactions[i].length; j++) {
                numberOfSales += transactions[i][j].getNumberOfSales();
            }
        }
        return numberOfSales;
    }
}


