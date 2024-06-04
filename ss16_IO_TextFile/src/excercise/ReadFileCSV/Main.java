package excercise.ReadFileCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  final String SRC = "D:\\Codegym\\module2\\Module 2\\ss16_IO_TextFile\\src\\excercise\\ReadFileCSV\\countries.csv";

    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            String line ;
            br = new BufferedReader(new FileReader(SRC));
            while ((line = br.readLine()) != null){
                displayCountry(parseCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (br !=null){
                    br.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<String> parseCsvLine (String csvLine){
        List<String> result = new ArrayList<>();
        if (csvLine != null){
            String [] splitData = csvLine.split(",");
            for (String str : splitData ){
                result.add(str);
            }
        }
        return result;
    }
    private static void displayCountry(List<String> countries){
        for (String str : countries){
            System.out.println(str);
        }
    }
}
