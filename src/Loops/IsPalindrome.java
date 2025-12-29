package Loops;

public class IsPalindrome {

    public static void main(String[] args) {

        int n=123321;
        int sum=0;
        int temp=n;
        while (n>0){
            int d=n%10;
            sum=sum*10+d;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
