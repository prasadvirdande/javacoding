package ArrayCoding;

public class SecondMax {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 4, 5, 6, 3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 3, 4, 6, 7, 8};
        int max = a[0];
        int secondMax = a[0];
        for (int i : a) {
            if (max < i) {
                max = i;
            }
            else if(secondMax<i){
                secondMax=i;
            }
            }
            System.out.println(secondMax);
        }
    }
