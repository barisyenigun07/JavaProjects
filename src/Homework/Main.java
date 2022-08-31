package Homework;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static Bag<Item> longest(Bag<Item> box1, Bag<Item> box2, Bag<Item> box3, Bag<Item> box4) {
        int[] lengths = {box1.getCurrentSize(), box2.getCurrentSize(), box3.getCurrentSize(), box4.getCurrentSize()};
        if (box1.getCurrentSize() == max(lengths)) {
            return box1;
        } else if (box2.getCurrentSize() == max(lengths)) {
            return box2;
        } else if (box3.getCurrentSize() == max(lengths)) {
            return box3;
        } else if (box4.getCurrentSize() == max(lengths)){
            return box4;
        }
        else{
            return null;
        }
    }
    public static Item findItem(Item[] box) {
        double max_val = box[0].getValue();
        Item item = box[0];
        for (int index = 1; index < box.length; index++) {
            if (box[index].getValue() > max_val) {
                item = box[index];
            }
        }

        return item;
    }

    public static void transfer(Bag<Item> bag1, Bag<Item> bag2, Bag<Item> bag3, Bag<Item> bag4, Bag<Item> bag5,double maxWei) {
        while (true){
            try {
                Bag<Item> selBag = longest(bag2, bag3, bag4, bag5);
                Item[] arrBag = selBag.toArray();
                Item pickedItem = findItem(arrBag);
                if (getTotWei(bag1) <= maxWei){
                    bag1.add(pickedItem);
                    selBag.remove(pickedItem);
                }
                if (getTotWei(bag1) > maxWei){
                    bag1.remove(pickedItem);
                    selBag.add(pickedItem);
                    break;
                }
            }
            catch (Exception ex){
                break;
            }


        }
    }
    public static double getTotWei(Bag<Item> bag) {
        Item[] box = bag.toArray();
        double weight = 0;
        for (int i = 0; i < box.length; i++) {
            weight += box[i].getWeight();
        }
        return weight;
    }

    public static int getTotLspan(Bag<Item> bag) {
        Item[] box = bag.toArray();
        int lifespan = 0;
        for (int i = 0; i < box.length; i++) {
            lifespan += box[i].getGain();
        }
        return lifespan;
    }

    public static void main(String[] args) {
        Bag<Item> backpack = new Bag<>();
        Bag<Item> clothes = new Bag<>();
        Bag<Item> foodAndDrink = new Bag<>();
        Bag<Item> firstAid = new Bag<>();
        Bag<Item> tool = new Bag<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/Homework/items.txt")))) {
            while (scanner.hasNextLine()) {
                String info = scanner.nextLine();
                String[] array = info.split(",");
                String name = array[0];
                String id = array[1];
                String weight = array[2];
                double wei = Double.parseDouble(weight);
                String gain = array[3];
                int ga = Integer.parseInt(gain);
                double value = ga / wei;
                Item item = new Item(name, wei, ga, value);
                if (id.equals("0")) {
                    clothes.add(item);
                } else if (id.equals("1")) {
                    foodAndDrink.add(item);
                } else if (id.equals("2")) {
                    firstAid.add(item);
                } else if (id.equals("3")) {
                    tool.add(item);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
        String menu = "**********************************************\n" +
                "Clothing\t\t" + clothes.getCurrentSize() + " items\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(clothes)) + " kg\n" +
                "Food&Drink\t\t" + foodAndDrink.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(foodAndDrink)) + " kg\n" +
                "First Aid\t\t" + firstAid.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(firstAid)) + " kg\n" +
                "Tool\t\t\t" + tool.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(tool)) + " kg\n" +
                "**********************************************";
        String option = "[0] Pilgrim  [1] Voyager  [2] Stalker  [3] Interloper  [9] Exit";
        System.out.println("Welcome To Survival Game!");
        System.out.println(menu);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Select Difficulty:");
            System.out.println(option);
            String sel = scan.nextLine();
            if (sel.equals("9")){
                break;
            }
            else if (sel.equals("0")) {
                if (getTotWei(backpack) > 9) {
                    backpack.clear();
                    transfer(backpack, clothes, foodAndDrink, firstAid, tool,9);
                } else {
                    transfer(backpack,clothes,foodAndDrink,firstAid,tool,9);
                }
            }
            else if (sel.equals("1")) {
                if (getTotWei(backpack) > 7) {
                    backpack.clear();
                    transfer(backpack, clothes, foodAndDrink, firstAid, tool,7);
                } else {
                    transfer(backpack, clothes, foodAndDrink, firstAid, tool,7);

                }
            }
            else if (sel.equals("2")) {
                if (getTotWei(backpack) > 5) {
                    backpack.clear();
                    transfer(backpack, clothes, foodAndDrink, firstAid, tool,5);
                } else {
                    transfer(backpack, clothes, foodAndDrink, firstAid, tool,5);
                }
            }
            else if (sel.equals("3")) {
                if (getTotWei(backpack) > 3) {
                    backpack.clear();
                    transfer(backpack, clothes, foodAndDrink, firstAid, tool,3);
                } else {
                    transfer(backpack, clothes, foodAndDrink, firstAid, tool,3);

                }
            }
            else {
                System.out.println("Invalid Option!");
            }
            String upMenu = "**********************************************\n" +
                    "Clothing\t\t" + clothes.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(clothes)) + " kg\n" +
                    "Food&Drink\t\t" + foodAndDrink.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(foodAndDrink)) + " kg\n" +
                    "First Aid\t\t" + firstAid.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(firstAid)) + " kg\n" +
                    "Tool\t\t\t" + tool.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(tool)) + " kg\n" +
                    "Backpack\t\t" + backpack.getCurrentSize() + " items\t\t" + "|\t" + new DecimalFormat("##.##").format(getTotWei(backpack)) + " kg\n" +
                    "Lifespan\t\t" + getTotLspan(backpack) + " days\t\t" + "|\t\n" +
                    "**********************************************";
            System.out.println(upMenu);
            if (clothes.getCurrentSize() == 0 && foodAndDrink.getCurrentSize() == 0 && firstAid.getCurrentSize() == 0 && tool.getCurrentSize() == 0) {
                System.out.println("No items left in the boxes.");
                break;
            }
        }
    }
}
