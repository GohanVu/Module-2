package exercise;

public class CreatFanClass {
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    boolean On;
    private double radius = 5;
    private String color = "Bule";

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CreatFanClass(){

    }
    public String toString(){
        if (On){
            return "Speed: "+ getFAST() + " color: "+getColor()+ " fan is on";
        } else {
            return "Color: "+getColor()+" radius: "+ getRadius()+ " fan is off";
        }
    }

    public static void main(String[] args) {
        CreatFanClass fan1 = new CreatFanClass();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        CreatFanClass fan2 = new CreatFanClass();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
