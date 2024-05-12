import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MergeArray mergeArray = new MergeArray();
       int [] arr1 = new int[2];
       int [] arr2 = new int[3];
       System.out.println("Array_1 has "+ arr1.length+ " element");
       int [] newArr1 = mergeArray.addElement(arr1);
       System.out.println("Array_1: "+Arrays.toString(newArr1));
       System.out.println("----------------------------------");
       System.out.println("Array_2 has "+ arr2.length+ " element");
       int [] newArr2 = mergeArray.addElement(arr2);
       System.out.println("Array_2: "+Arrays.toString(newArr2));
       System.out.println("__________________________________");
       int [] newArr3 = mergeArray.mergeArray(newArr1,newArr2);
       System.out.println("Array_3 merged by 2 array");
       System.out.println("Array_3: "+Arrays.toString(newArr3));

    }
    public int [] addElement (int [] arr){
        int [] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element "+ (i+1)+ " : ");
            int value = Integer.parseInt(scanner.nextLine());
            newArr[i] =  value;
        }
        return newArr ;
    }
    public int [] mergeArray (int[] arr1, int [] arr2){
        int [] mergeArray = new int[arr1.length+arr2.length];
        int i = 0;
        for (; i < arr1.length ; i++) {
            mergeArray[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++,i++) {
            mergeArray[i] = arr2[j];
        }
        return mergeArray;
    }
}
