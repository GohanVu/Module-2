package exercise;

import java.util.Random;

public class CreateStopWatchClass {
    private long startTime ;
    private long endTime ;

    public  CreateStopWatchClass (){
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
    public static  int [ ] generateRandomNumbers(int num){
        int [ ] result = new int[num];
        Random rand = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt();
        }
        return result;
    }
    public static  void selectionSort(int[ ]array){
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = 0; j < array.length; j++) {
                if (array[i]< array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] numbers = generateRandomNumbers(100000);
        CreateStopWatchClass stopwatch = new CreateStopWatchClass();
        stopwatch.start();
        selectionSort(numbers);
        stopwatch.stop();
        System.out.println("Elapsed time: "+stopwatch.getElapsedTime()+ " milliseconds");
    }
}
