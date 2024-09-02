package ex_28072024;

public class Lab126 {
    public static void main(String[] args) {
        Lab125_Bank bank1 = new Lab125_Bank();
        Lab125_Bank bank2 = new Lab125_Bank();

        bank1.bname = "SBI";
        bank1.bbal = 100;
        System.out.println(bank1.bname);
        System.out.println(bank1.bbal);
        bank1.creditbal();
        bank1.wihdraw();

        bank2.bname ="HDFC";
        System.out.println(bank2.bname);
        System.out.println(bank2.bbal);

    }
}
