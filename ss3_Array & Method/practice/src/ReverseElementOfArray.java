import java.util.Scanner;

public class ReverseElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        do {
            System.out.println("Enter a size");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        int [] array = new int [size];
        int i = 0 ;
        while ( i < array.length)   {
            System.out.println("Enter element "+ (i+1)+ ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++ ;
        }
        System.out.println("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        System.out.println("\n"+"Reversed array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+ " ");
        }
    }


}
