package ExceptionClass;

import java.util.Scanner;

public class Main {
    public static void mekanKontrol(int yas){
        if (yas < 18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Mekana Hoşgeldiniz...");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı girin:");
        int yas = scanner.nextInt();
        try {
            mekanKontrol(yas);
        }
        catch (InvalidAgeException e){
            System.out.println(e);
        }

    }
}
