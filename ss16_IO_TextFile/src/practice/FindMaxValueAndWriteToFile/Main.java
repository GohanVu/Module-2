package practice.FindMaxValueAndWriteToFile;

import practice.CalculateSumOfNumberInTextFile.ReadFileExample;

import java.util.List;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Import link:" );
        String filePath = scanner.nextLine();

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.ReadFile(filePath);
        int max = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.WriteFile("src/practice/FindMaxValueAndWriteToFile/result.txt",max);
    }
}