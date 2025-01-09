package jspider.ifalse;

public class CheckChar {
    //Take a character as user input and check whether the character is an alphabet or not
    public static void main(String[] args) {
        char c= 'D';
        if ((c>='A'&& c<='Z')||(c>= 'a' && c<='z')){
            System.out.println(c+" : is an alphabet");
        }
        else {
            System.out.println(c+"is not alphabet ");
        }
    }
}
