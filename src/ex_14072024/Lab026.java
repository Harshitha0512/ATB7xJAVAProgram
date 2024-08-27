package ex_14072024;

public class Lab026 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a+b; byte +byte = int -> when we add 2 byte then we will get the result in integer
        int c = a+b;
        System.out.println(c);

        char a1 = 'A'; //65 ASCII value
        char b1 = 'B'; //66 ASCII value
        //char c1 = a1+b1;char +char = int -> when we add 2 char then we will get the result in integer - In java char will be come under integer
        int c1 = a1+b1;
        System.out.println(c1);
        System.out.println('A'==65);
        System.out.println('B'==66);

    }
}
