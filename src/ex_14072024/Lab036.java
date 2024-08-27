package ex_14072024;

public class Lab036 {
    public static void main(String[] args) {
        String name = "The test value";
        String name1 = "The test value";
        System.out.println( name == name1);//check for reference

        System.out.println("-------------------");

        String str = new String("The test value");
        String str1 = new String("The test value");
        System.out.println(str == str1);//check for reference
        System.out.println(str.equals(str1));//check for content
    }
}
