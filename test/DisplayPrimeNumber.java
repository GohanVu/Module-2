import java.util.Scanner;

public  class DisplayPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        DisplayPrimeNumber displayPrimeNumber = new DisplayPrimeNumber();
        if (displayPrimeNumber.isPrimeNumber(number)){
            System.out.println(number+ " is prime number");
        } else {
            System.out.println(number+ " is NOT prime number");
        }
    }
    public boolean isPrimeNumber (int n){
        boolean check = true;
        if (n < 2){
            check = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}