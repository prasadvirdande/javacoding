package ArrayCoding;


import java.util.Scanner;

public class SearchinganElement {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5,4,5,6,3,4,5,6,7,8,9,6,5,4,3,4,6,7,8};
        Scanner scanner = new Scanner(System.in);
        int search ;
        System.out.println("Enter the element to search");
        search=scanner.nextInt();
        for(int i=0;i<a.length;i++){
            if(i==search){
                System.out.println("Element found at index " + i);
                System.exit(0);
            }
            else{
                System.out.println("Element not found");
              break;
            }

        }


        }

    }

