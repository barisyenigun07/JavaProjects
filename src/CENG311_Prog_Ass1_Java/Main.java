package CENG311_Prog_Ass1_Java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/CENG311_Prog_Ass1_Java/input.txt")))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] arr = line.split(" ");
                long start = System.currentTimeMillis();
                for (int i = 0;i < arr.length;i++){
                    priorityQueue.offer(Integer.parseInt(arr[i]));
                }
                long end = System.currentTimeMillis();
                System.out.println("Process took " + ((double) (end - start)) / 1000 +  " seconds");
            }

        }catch (FileNotFoundException ex){
            System.out.println("File Not Found!");
        }
    }
}
