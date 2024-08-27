package ex_13072024;

public class Lab011 {
    public static void main(String[] args) {
        //concatenation
        String s1 = "Harshitha";
        String s2 = "Vinay";
        System.out.println(s1+s2);

        String s3 = "Value";
        int x = 100;
        int y = 200;
        System.out.println(x+y);
        System.out.println(x+s3);
        System.out.println(y+s3);
        System.out.println(x+y+s3);
        System.out.println(x+s3+y);
        System.out.println(s3+x+y);
        System.out.println(x+y+s3+y+s3+x+y);//300Value200Value100200

    }
}
