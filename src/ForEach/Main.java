package ForEach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] array = {"elma","armut","muz"};
        int[] array2 = {1,2,3,4,5};
        for (int i : array2){
            System.out.println(i);
        }
        for (String s: array) {
            System.out.println(s);

        }
    }
}
