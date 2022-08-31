package VectorlerVeStackler;
import java.util.Stack;
public class Main {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Python");
        stack.push("Java");
        stack.push("C#");
        stack.push("Php");
        System.out.println(stack.size());
        while (!stack.empty()){
            System.out.println("Eleman Çıkarılıyor: " + stack.pop());
        }

    }

}
