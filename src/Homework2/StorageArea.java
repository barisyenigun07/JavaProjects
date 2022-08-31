package Homework2;

public class StorageArea {
    private Stack<String> stack;
    public StorageArea(){
        this.stack = new Stack<>();
    }
    public boolean pushCannedFood(){
        boolean result = true;
        if (!stack.isFull()){
            stack.push("cannedfood");
        }
        else{
            result = false;
        }
        return result;
    }
    public boolean pushDryFood(){
        boolean result = true;
        if (!stack.isFull()){
            stack.push("dryfood");
        }
        else{
            result = false;
        }
        return result;
    }
    public boolean feed(){
        boolean result = true;
        if (!stack.isEmpty()){
            stack.pop();
        }
        else{
            result = false;
        }
        return result;
    }

}
