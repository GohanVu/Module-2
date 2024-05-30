package excersice.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"TV",100);
        Product product1 = new Product(2,"Laptop",300);
        Product product2 = new Product(3,"Smartphone",200);

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.display();
        System.out.println("-----------------------");
        System.out.println(productManager.findByName("Laptop"));
        productManager.fixById(2,"New Laptop",250);
        productManager.delete(1);
        System.out.println("-----------------------");
        productManager.display();
    }
}
