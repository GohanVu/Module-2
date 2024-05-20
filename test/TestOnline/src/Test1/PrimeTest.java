package Test1;

public class PrimeTest {
    public static void main(String[] args) {
        PrimeTest primeTest = new PrimeTest();
        primeTest.testIsPrime();

    }
    public void  testIsPrime(){
        PrimeChecker primeChecker = new PrimeChecker();
        assert primeChecker.isPrime(2) == true: "2 should be prime";
        assert primeChecker.isPrime(4) == false: "4 should not be prime";
        assert primeChecker.isPrime(17) == true: "17 should be prime";
        assert primeChecker.isPrime(18) == false: "18 should not be prime";
        System.out.println("All tests passed.");

    }
    public  class PrimeChecker{
        public boolean isPrime(int number){
            if (number <= 1){
                return false;
            }
            for (int i =2; i < number; i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
