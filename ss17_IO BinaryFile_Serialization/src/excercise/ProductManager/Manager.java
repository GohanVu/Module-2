package excercise.ProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Product> products;
    private File file;

    public Manager (String filePath){
        file = new File(filePath);
        products = new ArrayList<>();
    }
    public void  readProduct(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            products = (List<Product>) ois.readObject();
        } catch (IOException e){
            System.err.println("Error read file");
        } catch (ClassNotFoundException e) {
            System.err.println("Not found class");
        }
    }
    public void writeProduct(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(products);
        } catch ( IOException e ){
            e.printStackTrace();
        }
    }
    public  void addProduct (Product product){
        products.add(product);
    }
}
