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
    }
}
