package ex_14072024;

public class Lab030 {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
        //int com_amt = course+gst; compiler error
        int com_amt = (int)gst+course;
        System.out.println(com_amt); // loss pf 0.45 rupees
        float com_amt1 = course+gst;
        System.out.println(com_amt1);
        //output will be always bigger buket - when we compare int & float - float is in bigger in size

    }
}
