import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("Enter value: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("Position: ");
        int index = Integer.parseInt(scanner.nextLine());
        InsertElementInArray insertElementInArray = new InsertElementInArray();
        System.out.println("New array: "+Arrays.toString(insertElementInArray.insertElement(arr,value,index)));
    }
    public int [] insertElement(int [] arr, int value, int index){
        int [] newArr = new int[arr.length];
        for (int i = 0, j= 0; i < arr.length ; i++, j++) {
            if (i == index){
                newArr[j] = value;
                j++;
            }
            if (j < arr.length){
                newArr[j] = arr[i];
            }
        }
        return newArr;
    }
}
