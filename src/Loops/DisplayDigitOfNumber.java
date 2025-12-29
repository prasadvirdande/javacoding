package Loops;

public class DisplayDigitOfNumber {

    public static void main(String[] args) {

        int n=257;
        while(n>0){
            int digit=n%10;
            System.out.println(digit);
            n=n/10;
        }
    }
}
