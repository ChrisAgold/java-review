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
        // System.out.println("Area of rectangle " + areaRectangle(5,3));
        //  double area = areaRectangle(5,3);
        //  System.out.println(area);

        // METHOD OVERLOADING CALL
        System.out.println(       "Area of rectangle: " + area(14.25d, 10.65d));
        System.out.println(       "Area of rectangle: " + area(5.0d));
        System.out.println(       "Area of rectangle: " + area(7));
    }

    // AREA OF RECTANGLE METHOD
//    public static double areaRectangle(double length, double width) {
//        return length * width;
//    }

    // METHOD OVERLOADING AREA OF RECTANGLE
    public static double area(double length, double width) {
        return length * width;
    }
    // METHOD OVERLOADING AREA OF SQUARE
    public static double area(double side) {
        return side * side;
    }
    // METHOD OVERLOADING AREA OF SQUARE
    public static int area(int side) {
        return side * side;

    }
}
