package jspider.ifalse;

public class BiggestFour {
    //wapj to find biggest four number usin else if statement
    public static void main(String[] args) {
        int x=425;
        int y=456;
        int r=556;
        int z=96;
        if (x>y && x>r && x>z){
            System.out.println("The biggest number is :"+x);
        } else if (y>r && y>z) {
            System.out.println("The biggest number  is :"+y);
        } else if (r>z) {
            System.out.println("The biggest number is :"+r);
        }
        else {
            System.out.println("the biggest number is :"+z);
        }
    }
}
