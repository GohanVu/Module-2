package excercise.CopyFileText;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input source file path: ");
        String sourceFilePath = scanner.nextLine();
        File sourceFile = new File(sourceFilePath);

        if(!sourceFile.exists() || !sourceFile.isFile()){
            System.out.println("File path doesn't exit or correct");
            return;
        }
        System.out.println("Import destination file path: ");
        String targetFilePath = scanner.nextLine();
        File targetFile = new File(targetFilePath);

        if(targetFile.exists()){
            System.out.println("Destination file path already exits");
            return;
        }

        // copy file by line
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
//        BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
//            String line;
//            while ((line = br.readLine()) != null){
//                bw.write (line);
//                bw.newLine();
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        //copy file by character
        try (FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(targetFile)){
            int charCount = 0;
            int character;
            while ((character = fileReader.read()) != -1){
                fileWriter.write(character);
                charCount++;
            }
            System.out.println("File copied successfully .Number of characters in file: "+charCount);
        } catch (IOException e){
            System.out.println("An error occurred during the file copy process: "+e.getMessage());
        }
   }
}
