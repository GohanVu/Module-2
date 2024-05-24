import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter large of array: ");
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int [] arrays = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value "+ (i+1)+": ");
            arrays[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter number you want to find: ");
        int findNumber = Integer.parseInt(sc.nextLine());
        boolean check = false;
        int index =0 ;
        for (int i = 0; i < size; i++) {
            if (arrays[i] == findNumber){
                check = true;
                index = i;
                break;
            }
        }
        if (check){
            System.out.println("Yes"+ "--Position:"+ (index+1));
        } else {
            System.out.println("No");
        }
    }
}
