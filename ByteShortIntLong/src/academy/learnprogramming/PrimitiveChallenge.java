package academy.learnprogramming;

public class PrimitiveChallenge {
    public static void main(String[] args){

        byte byteNum = (byte) 10;
        short shortNum = (short) 20;
        int intNum = 50;
        long longNum = 50000 + ((byteNum + shortNum + intNum) * 10);

        System.out.println("Long number = " + longNum);
    }
}
