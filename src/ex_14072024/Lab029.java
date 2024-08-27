package ex_14072024;

public class Lab029 {
    public static void main(String[] args) {
        long phone_no = 9876543345l;
        //shot no = phone_no;// compiler error
        short no = (short)phone_no;
        System.out.println(no);
    }
}
