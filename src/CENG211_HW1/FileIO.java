package CENG211_HW1;
import java.io.*;
import java.util.*;

public class FileIO {
    private String line;
    private int count;

    public String[][] getTransactions(String file) {
        count = 0;
        String[][] transactions = null;
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null){
                count++;
            }
            br.close();
            transactions = new String[count][];
            int row = 0;
            BufferedReader br2 = new BufferedReader(new FileReader(file));
            while ((line = br2.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line,",");
                int col = 0;
                transactions[row] = new String[st.countTokens()];
                while (st.hasMoreElements()){
                    transactions[row][col] = st.nextToken();
                    col++;
                }
                row++;
            }
            br2.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactions;
    }

    public String[][] getItems(){
        count = 0;
        String[][] items = null;
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/HW1_Items.csv"));
            while ((line = br.readLine()) != null){
                count++;
            }
            br.close();
            items = new String[count][];
            int row = 0;
            BufferedReader br2 = new BufferedReader(new FileReader("src/HW1_Items.csv"));
            while ((line = br2.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line,",");
                int col = 0;
                items[row] = new String[st.countTokens()];
                while (st.hasMoreElements()){
                    items[row][col] = st.nextToken();
                    col++;
                }
                row++;
            }
            br2.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }
}
