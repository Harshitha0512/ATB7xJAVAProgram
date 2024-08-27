package ex_14072024;

public class Lab040 {
    public static void main(String[] args) {
        String password ="Harshitha@123";
        String paasword1 = password.toLowerCase();
        System.out.println(password==paasword1);
        System.out.println(password.equalsIgnoreCase(paasword1));
    }
}
