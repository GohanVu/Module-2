package sample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/sample/hello.txt");
            FileWriter fileWriter = new FileWriter("src/sample/output.txt");
            int character;
            while ((character = fileReader.read()) != -1){
                fileWriter.write(character);
            }
            fileReader.close();
            fileWriter.close();
            System.out.println("Read and write from file successfully! ");
        } catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
