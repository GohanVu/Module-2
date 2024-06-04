package excercise.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager("D:\\Codegym\\module2\\Module 2\\ss17_IO BinaryFile_Serialization\\src\\excercise\\ProductManager\\testProduct.csv");
        while (true){
            System.out.println("1: Add product");
            System.out.println("2: Display product");
            System.out.println("3: Search product");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Enter code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter item: ");
                    String item = scanner.nextLine();
                    System.out.println("Enter describe: ");
                    String describe = scanner.nextLine();
                    manager.addProduct(new Product(code,name,price,item,describe));
            }
        }
    }
}
