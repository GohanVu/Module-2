package practice.CalculateSumOfNumberInTextFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Import link file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
