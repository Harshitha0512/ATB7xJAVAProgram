package ex_14072024;

public class Lab031 {
    public static void main(String[] args) {
        //pre-increment
        int a = 10;
        int b = ++a; // a=a+1
        System.out.println(b);
        System.out.println(a);

        int q = 100;
        System.out.println(++q);
        System.out.println("---------------");
        //post-increment
        int w = 10;
        int e = w++;
        System.out.println(e);//10
        System.out.println(w);//11
    }
}
