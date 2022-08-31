package DependencyInversion;

import java.util.Scanner;

public class Main {
    private static void printEmptyRectangle(String character1, String character2, int width, int height) {
        for (int j = 1; j <= width; j++) {
            System.out.print(character1);
        }
        System.out.println();
        for (int i = 1; i <= height - 2; i++) {
            System.out.print(character2);
            for (int j = 1; j <= width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(character2);
        }
        for (int j = 1; j <= width; j++) {
            System.out.print(character1);
        }
    }
    public static void main(String[] args){
        printEmptyRectangle("-","|",50,10);
        System.out.println();

        System.out.println("************************************************************************************");


        int width = 20;
        int height = 8;

        String[][] field = new String[height][width];

        for (int i = 0;i < height;i++){
            for (int j = 0;j < width;j++){
                if (i == 0 || i == (height - 1)){
                    field[i][j] = "-";
                }
                else{
                    if (j == 0 || j == (width - 1)){
                        field[i][j] = "|";
                    }
                    else{
                        field[i][j] = " ";
                    }
                }
            }
        }

        for (int h = 0;h < field.length;h++){
            System.out.println();
            for (int w = 0;w < field[h].length;w++){
                System.out.print(field[h][w]);
            }
        }

    }
}

