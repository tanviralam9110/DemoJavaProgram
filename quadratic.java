package jspider.ifalse;

public class  quadratic {
    // 3x*3x - 6x +1
    // d= b*b -4ac
    public static void main(String[] args) {

        double a = 3;
        double b = -6;
        double c = 1;
        double d = ((b * b) - (4 * a * c));
        if (d > 0) {
            System.out.println("To different root are possible:");
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);

        } else if (d==0) {
            System.out.println("Both root are same:");
            double root = (-b/(2*a));
            System.out.println("Both root are:"+root);
            }
        else {
            System.out.println("Real root are not possible:w");

        }
    }
}
