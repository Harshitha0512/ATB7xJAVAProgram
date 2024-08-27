package ex_14072024;

public class Lab033 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);//21

        int b = 20;
        System.out.println(b++ + ++b);// 20+22=42

        int c = 30;
        System.out.println(++c + ++c);//31+32=63

        int d = 40;
        System.out.println(++d + d++ + d++); // 41+41+42 = 124
        System.out.println(d);//43

    }
}
