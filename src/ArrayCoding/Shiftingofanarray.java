package ArrayCoding;

import java.util.Arrays;

public class Shiftingofanarray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 4, 5, 6, 3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 3, 4, 6, 7, 8};
        int n = 14;
        int index = 4;

        int[] result = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }

        result[index] = n;

        for (int i = index; i < a.length; i++) {
            result[i + 1] = a[i];
        }

        System.out.println(Arrays.toString(result));
    }
}

