package jspider.ifalse;

public class conditionalOp {
    public static void main(String[] args) {
        int a=5;
        int b=10;

        String res= (a<b)&&(b>a)?"biggest number":"samll" ;
        System.out.println(res);
    }
}
