package ArrayCoding;

import java.util.Arrays;

public class DeletionOfelement {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 4, 5, 6, 3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 3, 4, 6, 7, 8};
        int index = 4;
        int result[]= new int[a.length-1];
        for(int i=0;i<index;i++){
            result[i]=a[i];

        }
        for(int i=index;i<a.length-1;i++){
            result[i]=a[i+1];

        }
        System.out.println(Arrays.toString(result));

    }
}
