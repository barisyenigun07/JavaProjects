package CENG211_HW1;

public class Item {
    private int id;
    private String name;
    private String category;

    public Item(int id,String name,String category){
        this.setId(id);
        this.setName(name);
        this.setCategory(category);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
