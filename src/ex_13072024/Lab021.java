package ex_13072024;

public class Lab021 {
    public static void main(String[] args) {
        //Relational operator - result will be in boolean
        // >, <, >=, <=, ==, !=
        int age_vinay = 33;
        int age_harshitha =29;
        boolean result = age_harshitha>age_vinay;
        System.out.println(result);
        boolean result1 = age_vinay>age_harshitha;
        System.out.println(result1);
        int a = 10;
        int b = 20;
        boolean c = (10>=10); // 10> 10 or 10=10?
        System.out.println(c);//true
    }
}
