public class Display20FirstPrimeNumber {
    public static void main(String[] args) {
        Display20FirstPrimeNumber display20FirstPrimeNumber = new Display20FirstPrimeNumber();
        int count = 0 ;
        int number = 0 ;
        while (count < 20){
            if (display20FirstPrimeNumber.isPrime(number)){
                System.out.print(number+ " ");
                count++;
            }
            number++;
        }

    }
    public boolean isPrime(int n){
        boolean check = true;
        if (n < 2){
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0){
                    check = false;
                    break;
                }
            }
        }
        return  check;
    }
}