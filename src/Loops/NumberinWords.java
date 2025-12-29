package Loops;

public class NumberinWords {

    public static void main(String[] args) {

        int num=1000;
        String sum="";
        while(num>0){

            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println(sum);
        char c;
        for(int i=sum.length()-1;i>=0;i--){
            c=sum.charAt(i);
            switch (c){
                case '0':System.out.println("Zero");
                break;
                case '1':System.out.println("one");
                break;
            }
        }



    }
}
