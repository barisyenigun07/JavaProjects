package AutoboxingVeUnboxing;


import java.util.ArrayList;
import java.sql.*;

public class Main {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            arrayList2.add(Integer.valueOf(i * 4)); // Autoboxing
        }
        for (int i = 0;i < arrayList2.size();i++){
            System.out.println(arrayList2.get(i).intValue()); //Unboxing
        }


    }
}
