package ex_21072024;

public class Lab089 {
    public static void main(String[]args){
        //fizz buzz program - print from 1 to 100
        // for multiple of 3 - print "Fizz"
        //for multiple of 5 - print "buzz"
        //for multiple of both 3 & 5 - fizz buzz
//"when we have 1 or more condition then that statement should be first'
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0 && i%5 ==0){
                System.out.println("Fizz Buzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }

        }

    }
}
