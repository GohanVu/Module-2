public class DisplayPrimeNumberLessThan100 {
    public static void main(String[] args) {
        DisplayPrimeNumberLessThan100 displayPrimeNumberLessThan100= new DisplayPrimeNumberLessThan100();

        for (int i = 2; i < 100 ; i++) {
            if (displayPrimeNumberLessThan100.isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public boolean isPrime (int n){
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
