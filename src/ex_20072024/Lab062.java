package ex_20072024;

public class Lab062 {
    public static void main(String[] args) {
        int itemcode = 010;
        switch (itemcode){
            case 001, 002, 010, 020:
                System.out.println("its electronic gadget");
                break;
            case 006,011,111,000:
                System.out.println("its mechanical gadget");
                break;
            default:
                System.out.println("none");
    }
}

}
