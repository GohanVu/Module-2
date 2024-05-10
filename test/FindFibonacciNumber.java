import java.util.Arrays;
import java.util.Scanner;

public  class FindFibonacciNumber {
    public static void main(String[] args) {
        System.out.println("How many prime number display ?:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        FindFibonacciNumber findPrimeNumber = new FindFibonacciNumber();
        int [] fibonacciArray = findPrimeNumber.findFibonacciNumber(number);
        System.out.println(Arrays.toString(fibonacciArray));

    }
    public  int [] findFibonacciNumber(int n){
        int [] fibonacciArr = new int[n];
        if(n>=1){
            fibonacciArr[0] = 0;
        }
        if (n>=2 ){
            fibonacciArr[1] = 1;
        }
        if (n>=3){
            for (int i = 2; i <n ; i++) {
                fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
            }
        }
        return fibonacciArr;
    }
}