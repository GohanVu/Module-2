package exercise;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        System.out.println("Enter VND value: ");
        Scanner scanner = new Scanner(System.in);
        double vndValue = scanner.nextDouble();
        double rate = 1.0/23000 ;
        double usdValue = vndValue * rate ;
        System.out.println("USD: "+String.format("%.2f", usdValue)+"$");

    }
}
