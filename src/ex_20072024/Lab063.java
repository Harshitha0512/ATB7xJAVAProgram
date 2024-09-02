package ex_20072024;

public class Lab063 {
    public static void main(String[] args) {
        int itemcode = 006;

        switch (itemcode){
            case 001 -> System.out.println("its case 1");
            case 002 -> System.out.println("its case 2");
            case 003 -> System.out.println("its case 3");
            default -> System.out.println("dont have the case");
        }
    }
}
