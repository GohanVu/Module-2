import java.util.Scanner;

public class ConvertTempApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertTempApp convertTempApp = new ConvertTempApp();
        double fahrenheit ;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.println("Fahrenheit to Celsius: "+convertTempApp.fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = Double.parseDouble(scanner.nextLine());
                    System.out.println("Celsius to Fahrenheit: "+convertTempApp.celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
    public double celsiusToFahrenheit (double celsius){
        double fahrenheit = (9.0/5) * celsius + 32;
        return fahrenheit;
    }
    public  double fahrenheitToCelsius ( double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
