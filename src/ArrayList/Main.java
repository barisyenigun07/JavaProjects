package ArrayList;

import java.util.ArrayList;

class DemoClass{
    private String name;
    private String code;

    public DemoClass(String name,String code){
        this.name = name;
        this.code = code;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void giveError(String name){
        if (!this.name.equals(name)){
            System.out.println("Error!");
        }
    }
}

class AnotherClass{
    private long id;
    private String name;

    public AnotherClass(long id,String name){
        this.id = id;
        this.name = name;
    }


}

public class Main {

    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("python");
        arrayList.add("java");
        arrayList.add("c#");
        arrayList.add("php");

        DemoClass demoClass = new DemoClass("charlie","c240");

        demoClass.setName("bravo");

        demoClass.giveError("charlie");



    }
}
