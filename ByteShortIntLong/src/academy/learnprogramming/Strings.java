package academy.learnprogramming;

public class Strings {
    public static void main (String[] args){
        String myString = "My string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is equal to " + myString);
        String numberSring = "250.55";
        numberSring = numberSring + "49.95";
        System.out.println(numberSring);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println(lastString);
    }
}
