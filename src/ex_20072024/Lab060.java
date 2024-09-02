package ex_20072024;

public class Lab060 {
    public static void main(String[] args) {
        int a = 10;
        switch (a){
            //valid
        }
        char ch = 'A';
        switch (ch){
            //valid
        }
//
//        boolean b = true;
//        switch (b){
//            //invalid
//        }
        long l = 98765467l;
        switch ((int)l){
            //valid
        }
    }
}
