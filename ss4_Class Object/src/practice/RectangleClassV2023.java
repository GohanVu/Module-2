package practice;

import java.util.Scanner;

public class RectangleClassV2023 {
    double width ;
    double height;
    public RectangleClassV2023(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height ;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2 ;
    }
    public String display(){
        return "Rectangle: { width: "+ this.width+" height: "+ this.height+" }";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());
        RectangleClassV2023 rectangle = new RectangleClassV2023(width,height);
        System.out.println(rectangle.display());
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+ rectangle.getPerimeter());
    }
}