package ex_14072024;

public class Lab041 {
    public static void main(String[] args) {
        //ternary operator
        // if true do this : else do that
        int result = 10>40 ? 89 : 91;
        System.out.println(result);//91

        String str = 10>20 ? "10" :"TWENTY";
        System.out.println(str); //TWENTY

        String str1 = 20>10 ? "grater is 20" : "10 is less";
        System.out.println(str1);
    }
}
