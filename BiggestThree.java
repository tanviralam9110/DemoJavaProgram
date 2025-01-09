package jspider.ifalse;

public class BiggestThree {
    //WAPJ To find three biggest number of using if else statement
    public static void main(String[] args) {
        int x=105;
        int y=105;
        int z=106;
        if (x>y && x>z){
            System.out.println("The biggest number is:"+x);
        } else if (y>z) {
            System.out.println("The biggest number is:"+y);
        }
        else {
            System.out.println("The biggest number is:"+z);
        }
    }
}
