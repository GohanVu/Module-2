package practice.GeometricShapesSystem;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle() ;
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5,5.8,"Cyan", true);
        System.out.println(rectangle);
    }
}
