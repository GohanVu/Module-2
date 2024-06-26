package practice.IllustrationBubbleSortAlogrithm;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = Integer.parseInt(scanner.nextLine());
        int [] list = new int[size];
        System.out.println("Enter "+ list.length+" values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
    }
    public static void bubbleSortByStep(int [] list){
        boolean needNextPass = true;
        for (int i = 0; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if(list[i] > list[i+1]){
                    System.out.println("Swap "+list[i]+" with "+list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the "+i+"' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]+"\t");
            }
            System.out.println();
        }
    }
}
