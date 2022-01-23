package javaFullStack;
public class methods {
    public static void main(String[] args) {
        // CALL METHOD
        loop(2, 10);
        System.out.println("***********************************************");
        loop(4, 8);
        System.out.println("***********************************************");
        loop(3, 9);
    }
    // METHOD
    public static void loop(int step, int finalValue) {
        while (step <= finalValue) {
            System.out.println(step);
            step++;
        }
    }
}
