package Homework4;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BinarySearchTree allItems = new BinarySearchTree();
        BinarySearchTree coffeeTree = new BinarySearchTree();
        BinarySearchTree teaTree = new BinarySearchTree();
        BinarySearchTree frappuccinoTree = new BinarySearchTree();
        BinarySearchTree bakeryTree = new BinarySearchTree();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/CENG112_HW4_CafeMenu.txt")))){
            while (scanner.hasNextLine()){
                String info = scanner.nextLine();
                String[] array = info.split(",");
                String type = array[0];
                String name = array[1];
                String str_price = array[2];
                String size = array[3];
                int price = Integer.parseInt(str_price);
                if (type.equals("Coffee")) {
                    Coffee coffee = new Coffee(name,size,price);
                    allItems.add(coffee);
                    coffeeTree.add(coffee);
                } else if (type.equals("Frappuccino")) {
                    Frappuccino frappuccino = new Frappuccino(name,size,price);
                    allItems.add(frappuccino);
                    frappuccinoTree.add(frappuccino);
                } else if (type.equals("Tea")) {
                    Tea tea = new Tea(name,size,price);
                    allItems.add(tea);
                    teaTree.add(tea);
                } else if (type.equals("Bakery")) {
                    int calories = Integer.parseInt(size);
                    Bakery bakery = new Bakery(name,calories,price);
                    allItems.add(bakery);
                    bakeryTree.add(bakery);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(coffeeTree.getMinimum());
        System.out.println(coffeeTree.getMaximum());
        System.out.println("*************");
        System.out.println(teaTree.getMinimum());
        System.out.println(teaTree.getMaximum());
        System.out.println("*************");
        System.out.println(bakeryTree.getMinimum());
        System.out.println(bakeryTree.getMaximum());
        System.out.println("*************");
        allItems.reverseTraverse();
        System.out.println("*************");
        allItems.inorderTraverse();
        System.out.println("*************");
        frappuccinoTree.inorderTraverse();
        System.out.println("*************");
        teaTree.reverseTraverse();
        System.out.println("*************");
        System.out.print("Enter the price:");
        int price = sc.nextInt();
        allItems.printLessOrEqual(price);
        System.out.println("*************");
        allItems.printGreater(price);
        System.out.println("*************");

    }
}
