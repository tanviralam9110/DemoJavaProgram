package jspider.ifalse;

public class TriangleAngle {
    public static void main(String[] args) {
       double a = 60;
        double b = 60;
        double c = 60;
       double sum = a + b + c;
        if ( sum == 180&& a ==60 && b ==60 && c ==60){
            System.out.println("This is valid angle of triangle");
        }
        else {
            System.out.println("Not valid triangle of angle");
        }
    }
}
