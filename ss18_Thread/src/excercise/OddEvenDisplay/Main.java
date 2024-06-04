package excercise.OddEvenDisplay;

public class Main {
    public static void main(String[] args) {
        Thread oddThread = new OddThread("Odd Thread");
        Thread evenThread = new EvenThread("Even Thread");
        oddThread.start();
        evenThread.start();
    }
}
