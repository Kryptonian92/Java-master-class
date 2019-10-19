package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("My min value is = " + myMinIntValue);
        System.out.println("My max value is = " + myMaxIntValue);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("My max byte value = " + myMaxByteValue);
        System.out.println("My min byte value = " + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("My max Short value = " + myMaxShortValue);
        System.out.println("My min Short value = " + myMinShortValue);

        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("My max Long value = " + myMaxLongValue);
        System.out.println("My min Long value = " + myMinLongValue);
    }
}
