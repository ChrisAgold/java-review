package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value = " + myMinValue);
//        System.out.println("Integer Maximum Value = " + myMaxValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
    }
}
