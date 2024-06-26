package excersice.Triangle;

public class Triangle  extends  Shape {
    private double side1 = 1.0 ;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public  double getArea() {
        double p = getPerimeter()/2;
        double area = Math.sqrt(p*(p-side1)*(p-side2));
        return area;
    }
    public double getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }
    public boolean isTriangle(double a, double b, double c){
        if(a+b>c && a+c > b && b+c>a){
            return  true;
        }
        return  false;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "area= "+ getArea()+
                "perimeter= "+getPerimeter()+
                ", which is a subclass of "+ super.toString()+
                '}';
    }
}
