package jspider.ifalse;

public class Divisible {
    // write a program check whether is divisible by 5 and 11 or not
    public static void main(String[] args) {
        int num = 100;
        if (num/5==0 && num/11==0){
            System.out.println(num+ ": is divisible by 5 and 11");
        }
        else {
            System.out.println(num+ ":is not divisible by 5 and 11");
        }
    }
}
