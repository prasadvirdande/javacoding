package ArrayCoding;

public class FindingMax {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5,4,5,6,3,4,5,6,7,8,11,9,6,5,4,3,4,6,7,8};
        int max=a[0];
        for(int i:a){
           if(max<i){
               max=i;
           }

        }
        System.out.println(max);
    }
}
