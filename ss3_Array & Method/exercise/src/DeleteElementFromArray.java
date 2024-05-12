import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int [] arr = {10,4,6,7,8,6,2,3};
        System.out.println("Array :"+ Arrays.toString(arr));
        System.out.println("Enter value want to deleted: ");
        Scanner scanner = new Scanner(System.in);
        int deletedValue = Integer.parseInt(scanner.nextLine());
        DeleteElementFromArray deleteElementFromArray = new DeleteElementFromArray();
        int[] newArr = deleteElementFromArray.removeElement(arr, deletedValue);
        System.out.println("New array: "+Arrays.toString(newArr));


    }
    public int [] removeElement (int [] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                index = i;
                break;
            }
        }
        if (index != -1){
            int [] newArr = new int[arr.length];
            for (int i = 0, j=0; i < arr.length; i++) {
                if(i != index){
                    newArr[j++] = arr[i];
                }
            }
             return  newArr ;
        }else {
            return  arr;
        }
    }
}
