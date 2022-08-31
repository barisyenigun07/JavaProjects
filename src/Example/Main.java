package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("Mariam",1L,"mariam@gmail.com","Industrial Design");
        Student student2 = new Student("George",2L,"george@gmail.com","Computer Engineering");
        Student student3 = new Student("Mark",3L,"mark@gmail.com","Mechanical Engineering");
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student id: ");
        try {
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println("You selected Mariam");
                    break;
                case 2:
                    System.out.println("You selected George");
                    break;
                case 3:
                    System.out.println("You selected Mark");
                    break;
                default:
                    System.out.println("Invalid selection!!!");
            }
        }catch (Exception ex){
            System.out.println("Error!");
        }


    }
}
