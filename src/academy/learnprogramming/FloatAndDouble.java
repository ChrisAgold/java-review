package academy.learnprogramming;

public class FloatAndDouble {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

// Convert a given number of pounds to kilograms
        double numberOfPounds = 200d;
        double convertedKilogram = numberOfPounds * 0.45359237d;

        System.out.println("Converted kilograms = " + convertedKilogram);
    }
}
