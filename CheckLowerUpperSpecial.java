package jspider.ifalse;

public class CheckLowerUpperSpecial {
    //Write a program to input in character to check whether it is alphabet or digit and special character
    public static void main(String[] args) {

        char c= 'f';
        if (c>='A' && c<='Z'){
            System.out.println(c+": is Upper case character");
        } else if (c>='a' && c<='z') {
            System.out.println(c+": is Lower case character");
        } else if (c>=48 && c<=57) {
            System.out.println(c+": is digit character");
        }
        else {
            System.out.println(c+" :is special character");
        }
    }
}
