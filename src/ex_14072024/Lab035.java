package ex_14072024;

public class Lab035 {
    public static void main(String[] args) {
        //In 2 ways user can able to create String
        String name ="Harshitha";
        String str = new String("Harshitha");
        System.out.println(str.toLowerCase());//harshitha
        System.out.println(str.toUpperCase());//HARSHITHA
        System.out.println(str.charAt(8));//a
        System.out.println(str.indexOf('t'));
        //System.out.println(str.charAt(10));//index out of boundary

    }
}
