package practice.InterfaceComparable;

public class Shape {
    private String color ;
    private boolean filled;

    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of "+getColor() +" and "+(isFilled() ? "filled": "not filled");
    }
}