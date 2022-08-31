package Arrayler;


import java.util.Scanner;

public class Main {
    public static <E> void yazdir(E[] dizi){
        for (E e : dizi){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] int_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Python","Java","Php","MySql","Javascript"};
        yazdir(char_dizi);
        System.out.println("**************");
        yazdir(int_dizi);
        System.out.println("**************");
        yazdir(string_dizi);

    }
}
