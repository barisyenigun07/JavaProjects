package CENG211_HW1;

public class ItemTransaction {
    private Item item;
    private Transaction[][] transactions;

    public ItemTransaction(Item item,Transaction[][] transactions){
        this.setItem(item);
        this.setTransactions(transactions);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Transaction[][] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[][] transactions) {
        this.transactions = transactions;
    }
}
