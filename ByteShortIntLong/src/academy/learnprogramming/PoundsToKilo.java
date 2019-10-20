package academy.learnprogramming;

//Converts a given number of pounds to kilograms
public class PoundsToKilo {
    public static void main (String[] args){
        double pounds = 10d;
        double conversion = pounds * 0.45359237d;
        System.out.println(pounds + " converted to kilograms is " + conversion);
    }
}
