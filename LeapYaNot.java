package jspider.ifalse;

import java.util.Scanner;

public class LeapYaNot {
    //WAPJ to find a leap year or not leap year
    public static void main(String[] args) {
        System.out.println("Enter your year in leap oe not ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if ( (num%100!=0 && num%4==0) ||(num%400==0))
         {
            System.out.println("This leap year:"+num);
        }
        else {
            System.out.println("This is not leap year:"+num);
        }
    }
}
