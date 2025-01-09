package jspider.ifalse;

public class LowerUpperCase {
    //To check program is character lower case(a-z) and upper case(A-Z)

    public static void main(String[] args) {

        char c = 't';
        if (c>='A' && c<='Z'){
            System.out.println(c+": is an upper case");
        }
        else {
            System.out.println(c+": is an lower case");
        }
    }
}
