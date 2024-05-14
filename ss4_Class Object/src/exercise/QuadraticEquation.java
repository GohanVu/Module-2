package exercise;

import java.util.Scanner;

public class QuadraticEquation {
    double  a;
    double b;
    double c;
    public QuadraticEquation (double a , double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC(){
        return  c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b ){
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public  double getDiscriminant(){
        return b*b - 4*a*c ;

    }
    public double  getRoot1(){
        return (-b - Math.sqrt(getDiscriminant()))/(2* a);

    }
    public double getRoot2(){
            return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("B:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("C:");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double discriminant = quadraticEquation.getDiscriminant();
        if(discriminant > 0){
            double root1 = quadraticEquation.getRoot1();
            double root2 = quadraticEquation.getRoot2();
            System.out.println("Root 1: "+ root1);
            System.out.println("Root 2: "+ root2);
        } else if ( discriminant == 0){
            double root = quadraticEquation.getRoot1();
            System.out.println("Root : "+ root);
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
