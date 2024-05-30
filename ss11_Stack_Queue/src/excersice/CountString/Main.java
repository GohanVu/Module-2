package excersice.CountString;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        System.out.println(str);
    }
}
