package views;

import java.util.Scanner;

public class ShirtView {
    public int view (){
        System.out.println("--------------Shirt View--------------");
        System.out.println("1.New product");
        System.out.println("2.Edit product");
        System.out.println("3.Delete product");
        System.out.println("4.Show all ");
        System.out.println("0.Exit");
        System.out.println("Input your choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice ;
    }
}
