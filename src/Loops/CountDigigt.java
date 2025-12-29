package Loops;

public class CountDigigt {

    public static void main(String[] args) {

        int n=12345678;
        int count=0;
       while(n>0){

            int digit=n%10;
            n=n/10;
            count++;
        }

        System.out.println(count);
    }
}
