package CENG211_HW2;
import java.io.*;
import java.util.StringTokenizer;

public class FileIO {
    private String line;
    private int count;

    public String[][] readValues(){
        count = 0;
        String[][] values = null;
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/HW2_InsuredValues.csv"));
            while ((line = br.readLine()) != null){
                count++;
            }
            br.close();
            if (count > 0){
                values = new String[count][];
                int row = 0;
                BufferedReader br2 = new BufferedReader(new FileReader("src/HW2_InsuredValues.csv"));
                while ((line = br2.readLine()) != null){
                    StringTokenizer st = new StringTokenizer(line,",");
                    int col = 0;
                    values[row] = new String[st.countTokens()];
                    while (st.hasMoreElements()){
                        values[row][col] = st.nextToken();
                        col++;
                    }
                    row++;
                }
                br2.close();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return values;
    }
}
