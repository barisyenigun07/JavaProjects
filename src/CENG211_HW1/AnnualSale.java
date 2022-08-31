package CENG211_HW1;

public class AnnualSale {
    private ItemTransaction[] itemTransactions;

    public AnnualSale(ItemTransaction[] itemTransactions){
        this.setItemTransactions(itemTransactions);
    }

    public ItemTransaction[] getItemTransactions() {
        return itemTransactions;
    }

    public void setItemTransactions(ItemTransaction[] itemTransactions) {
        this.itemTransactions = itemTransactions;
    }
}
