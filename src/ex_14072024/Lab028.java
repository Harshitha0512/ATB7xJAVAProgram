package ex_14072024;

public class Lab028 {
    public static void main(String[] args) {
        //type casting
        byte a = 10;
        int b = a; // Valid - Implicit casting
        int b1 = (int)a; //Valid - Explicit casting
        System.out.println(b1); //widening

        int val = 300;
        // byte b1 = val; Invalid - Implicit casting will be done by JVM - compliler error
        byte b2 = (byte)val;  //Invalid -Explicit casting - data will be loss - narrowing
        System.out.println(b2);

    }
}
