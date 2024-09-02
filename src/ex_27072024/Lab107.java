package ex_27072024;

public class Lab107 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {20,30,33},
                {32,22,40},
                {40,33,44}
        };
        for (int i = 0; i < array_2d.length ; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
