package javaFullStack;

public class methods {
    public static void main(String[] args) {
        // CALL METHOD
//        loop(2, 10);
//        System.out.println("***********************************************");
//        loop(4, 8);
//        System.out.println("***********************************************");
//        loop(3, 9);
//    }
        // METHOD
//    public static void loop(int step, int finalValue) {
//        while (step <= finalValue) {
//            System.out.println(step);
//            step++;
//        }

        // AREA OF RECTANGLE METHOD CALLS
        System.out.println("Area of rectangle " + areaRectangle(5,3));
        //  double area = areaRectangle(5,3);
        //  System.out.println(area);
    }
    // AREA OF RECTANGLE METHOD
    public static double areaRectangle(double length, double width) {
        return length * width;
    }
}
