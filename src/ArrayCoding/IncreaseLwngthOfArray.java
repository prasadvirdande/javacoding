package ArrayCoding;

public class IncreaseLwngthOfArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 4, 5, 6, 3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 3, 4, 6, 7, 8};

        int b[] = new int[2*a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println(a.length);
        System.out.println(b.length);

    }
}
