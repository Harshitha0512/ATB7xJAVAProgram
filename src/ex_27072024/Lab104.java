package ex_27072024;

public class Lab104 {
    public static void main(String[] args) {
    //find max and min of salary
        int[] salaries = {7,29, 20,33,10,14,9,10};
        int max = 1;
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if(salaries[i]>max){
                max = salaries[i];
            }
            if(min> salaries[i]){
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
