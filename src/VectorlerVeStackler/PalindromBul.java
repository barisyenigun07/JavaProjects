package VectorlerVeStackler;

import java.awt.*;
import java.util.Scanner;
import java.util.Stack;

public class PalindromBul {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin:");
        String cumle = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < cumle.length() / 2;i++){
            stack.push(cumle.charAt(i));
        }
        if (isPalindrome(cumle,stack)){
            System.out.println("Bu cümle palindromdur.");
        }
        else{
            System.out.println("Bu cümle palindrom değildir.");
        }
    }
    public static boolean isPalindrome(String cumle,Stack<Character> stack){
        for (int i = (cumle.length() / 2) + 1;i < cumle.length();i++){
            if (cumle.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
}
