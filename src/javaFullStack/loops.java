package javaFullStack;

public class loops {
    public static void main(String[] args) {

        // forLoop
//        for(int i = 1;i <=10; i++) {
//            System.out.println(i);
//        }

        // while loop
//        while(true) {
//            System.out.println("Infinite loop");
//            break;
//        }

        // doWhile
//        int i = 11;
//        do {
//            System.out.println(i);
//            i++;
//        } while(i<10);

        // more advance for loop
//        for(int i=1, j=1;i<10 || j<10 ; i++,j++) {
//            j++;
//            System.out.println("i="+i+" And j="+j);
//        }

        // more advanced while loop
//        int i = 1, j = 1;
//        while (i < 10 || j < 10) {
//            i++;
//            j++;
//            System.out.println("i=" + i + " And j=" + j);
//        }

        // more advance do while loop
//        int i = 1, j = 1;
//        do{
//            i++;
//            j++;
//            System.out.println("i=" + i + " And j=" + j);
//        }while (i < 10 || j < 10);

        // Break & Continue
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // Nested loops
        for(int i = 1; i <= 10; i++) {
            for(int j=1; j<=10;j++){
                System.out.println("Value of i:"+i+" Value of j:"+j);
            }
            System.out.println("*********************************");
        }
    }

}






