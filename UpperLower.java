package jspider.ifalse;

public class UpperLower {
    public static void main(String[] args) {
        char c= 'q';
        if (c>='A' && c<='Z'){
            System.out.println(c+": is an Upper case alphabet");
        }
        if (c>='a' && c<='z'){
            System.out.println(c+": is an lower case alphabet");
        }
    }
}
