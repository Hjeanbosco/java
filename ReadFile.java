import java.io.*;
import java.util.*;
import java.nio.*;
import java.lang.*;

public class ReadFile {
    public static void main(String[] args) throws Exception{
       ReadFile obj = new ReadFile();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Reg Number: ");
        String reg = sc.nextLine();

        Map<String, String> sts = obj.getData("stdnames.csv");
        Map<String, String> mks = obj.getData("stdmarks.csv");

        System.out.println("Name: " + sts.get(reg) + ", Marks:  " + mks.get(reg) + "");
    }
    public Map<String, S-\\tring> getData(String fileName){
        Map<String, String> datas = new HashMap<>();

        String line = "";
        String splitBy = ",";

        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null){
                String[] data = line.split(splitBy);
                datas.put(data[0], data[1]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return datas;
    }
}