package ex_21072024;

public class Lab094 {
    public static void main(String[] args) {
        //function without parameter & without return type
        //function without parameter & with return type
        //function with parameter & without return type
        //function with parameter & with return type
    function_type1();
    System.out.println(function_type2());
    function_type3("HarshithaM");
    int sum = funtion_type4(5,7);
    System.out.println(sum);
    }
    static void function_type1(){
        System.out.println("function without parameter & without return type");
    }
    static String function_type2(){
        System.out.println("function without parameter & with return type");
        return "Harshitha";
    }
    static void function_type3(String name){
        System.out.println("function with parameter & without return type");
        System.out.println("your name " + name);
    }
    static  int funtion_type4(int a, int b){
        System.out.println("function with parameter & with return type");
        return a+b;
    }
}
