import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name's student: ");
        Scanner scanner = new Scanner(System.in);
        String nameStudent = scanner.nextLine();
        FindValueInArray findValueInArray = new FindValueInArray();
        int index = findValueInArray.checkNameStudent(nameStudent,students);
        if (index != -1) {
            System.out.println("Position of the student "+ nameStudent+ " at position: "+index);
        } else {
            System.out.println("Not found student "+nameStudent );
        }
    }
        public int checkNameStudent (String n, String []students){
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(n)) {
                    return i+1;
                }
            }
            return -1;
        }
    }


