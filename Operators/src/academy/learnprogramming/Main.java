package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;  //1 + 2 = 3
        int prevResult = result;
        System.out.println("one +");
        result = result - 1;
        System.out.println(" 3 - 1 = " + result);
        result = result * 10;
        System.out.println("total = " + result);

        result = result % 3; // remainder of (4 % 3);
        System.out.println("4 % 3 = " + result );

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is an alien");
        }

        int topScore = 100;
        if (topScore == 100 || topScore != 100){
            System.out.println("You got got the top score");
        }

        int secondScore = 60;
        if (topScore > secondScore && topScore < 100){
            System.out.println("Greater than the second score and less than 100");
        }

        if ((topScore > 90) || (secondScore <=90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newVal = 50;
        if( newVal == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true:false;
    }
}
