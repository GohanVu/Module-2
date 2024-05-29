package excersice.Circle_Cylinder_Class;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"Red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(4,"Blue",5);
        System.out.println(cylinder.toString());
    }
}
