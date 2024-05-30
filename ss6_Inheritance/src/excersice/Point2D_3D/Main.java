package excersice.Point2D_3D;

import excersice.Point_MoveablePoint.MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5,6);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(5,6,7);
        System.out.println(point3D.toString());
        MoveablePoint moveablePoint = new MoveablePoint(3.0f,4.2f,5.6f,8.5f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
