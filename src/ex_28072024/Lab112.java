package ex_28072024;

public class Lab112 {
    public static void main(String[] args) {
        Lab111_Building bul = new Lab111_Building();
        System.out.println(bul.name = "Banashankari");
        System.out.println(bul.color="Blue");
        System.out.println(bul.address= "Hosadurga");
        System.out.println(bul.noofRooms = 3);

        bul.useLift();
        bul.activities();
        System.out.println("---------------------------");
        Lab111_Building prestige = new Lab111_Building();
        prestige.activities();
        prestige.useLift();
        System.out.println(prestige.color ="Pink");
    }
}
