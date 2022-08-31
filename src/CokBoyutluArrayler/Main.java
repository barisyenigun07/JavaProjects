package CokBoyutluArrayler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        int[][] array2 = new int[2][3];
        int i = 0;
        while (i < array.length){
            for (int j = 0;j < 2;j++){
                for (int k = 0;k < 3;k++){
                    array2[j][k] = array[i];
                    i++;
                }
            }
        }
        for (int s = 0;s < 2;s++){
            for (int m = 0;m < 3;m++){
                System.out.println(array2[s][m]);
            }
        }


    }
}
