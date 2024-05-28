package exercise.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap canh b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap canh c");
        double c = Double.parseDouble(scanner.nextLine());
        Triangle triangle = new Triangle(a,b,c);
    }
}
