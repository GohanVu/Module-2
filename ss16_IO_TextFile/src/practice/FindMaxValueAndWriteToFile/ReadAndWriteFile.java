package practice.FindMaxValueAndWriteToFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
  public List<Integer> ReadFile (String filePath){
      List<Integer> numbers = new ArrayList<>();
      try {
          File file = new File(filePath);
          if (!file.exists()){
              throw new FileNotFoundException();
          }
          BufferedReader br = new BufferedReader(new FileReader(file));
          String line = "";
          while ((line = br.readLine())!= null){
              numbers.add(Integer.parseInt(line));
          }
          br.close();
      } catch (Exception e){
          System.out.println("File not found or has error");
      }
      return numbers;
  }
  public void WriteFile(String filePath, int max){
      try{
          FileWriter fileWriter = new FileWriter(filePath,true);
          BufferedWriter bw = new BufferedWriter(fileWriter);
          bw.write("Max value: "+max);
          bw.close();
      } catch (Exception e){
          e.printStackTrace();
      }
  }
  public static int findMax (List<Integer> numbers){
     int max = numbers.get(0);
      for (int i = 0; i < numbers.size(); i++) {
          if ( numbers.get(i) > max){
              max = numbers.get(i);
          }
      }
      return max;
  }
}
