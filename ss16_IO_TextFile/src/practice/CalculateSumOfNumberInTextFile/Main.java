package practice.CalculateSumOfNumberInTextFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter link");
        String filePath = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.ReadFileText(filePath);
    }
}
