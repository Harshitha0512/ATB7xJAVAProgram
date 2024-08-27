package ex_13072024;

import java.sql.SQLOutput;

public class Lab009 {
    public static void main(String[] args) {

        //max age of the person in the world
        byte age = 122; // no wastage of memory
        int age1 = 122; // wastage of memory
        // byte age2 = 128;--> not able to assign - compiler error - as it can store only -127 to 127

        char c1 = 'A';
        System.out.println(c1);

        char c2 = '$';
        System.out.println(c2);

        char c3 = '\u1F6A'; //unicode characters - :) :( :\ :/
        System.out.println(c3);

        int _123 = 897;
        System.out.println(_123);


    }
}
