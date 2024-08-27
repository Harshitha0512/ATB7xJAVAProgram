package ex_13072024;

public class Lab024 {
    public static void main(String[] args) {
        // || OR gate
        System.out.println( true || true); // true
        System.out.println( true || false); // true
        System.out.println( false || true); // true
        System.out.println( false || false); // false
        System.out.println("------------------");
        // && AND gate
        System.out.println(true && true); //true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        System.out.println("------------------");
        int a1 = 12;
        boolean b1 = !(a1 > 10 || a1<5);
        System.out.println(b1);

    }
}
