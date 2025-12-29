package ArrayCoding;

import java.util.Arrays;

public class ReverseCopyingofarray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 4, 5, 6, 3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 3, 4, 6, 7, 8};
        int b[] = new int[a.length];
        System.out.println("A"+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            b[i]=a[a.length-1-i];
        }
        System.out.println(Arrays.toString(b));



    }
}
