package academy.learnprogramming;

public class FloatDouble {
    public static void main (String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMaxFloatValue);
        System.out.println("Float max value = " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println("Int Val = " + myInt);
        System.out.println("Float Val = " + myFloat);
        System.out.println("Double Val = " + myDouble);
    }
}
