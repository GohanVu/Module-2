import java.util.Scanner;

public class FindLargestValueInTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        do {
            System.out.println("Enter size array:");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20 || size < 1) {
                System.out.println("Size not invalid ");
            }
        } while ( size > 20 || size <1 );
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+(i+1));
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Element in array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]> max){
                max = array[i];
                index = i+1 ;
            }
        }
        System.out.println("\n"+"Max value in array: "+"\n");
        System.out.println(max + " at position: "+ index);
    }
}
