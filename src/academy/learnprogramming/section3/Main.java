package academy.learnprogramming.section3;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value = " + myMinIntValue);
//        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Maximum Value = " + myMinByteValue);
//        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Maximum Value = " + myMinShortValue);
//        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Maximum Value = " + myMinLongValue);
//        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
//        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

//        CASTING: CONVERT FROM ONE DATA TYPE TO ANOTHER, (byte) - want to convert number to byte
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

//        CHALLENGE
        byte byteValue = 4;
        short shortValue = 32;
        int intValue = 3000;

        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
//        System.out.println(longValue);
    }
}
