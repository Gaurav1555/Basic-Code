import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key:");
        int key = sc.nextInt();

        int arr[] = {12,13,44,56,78,90};


        //Approach 1) Implementing the binary search;

        // int start =0;int end = arr.length;
        // int mid;
        // int loc = -1;

        // while(start<=end){
        //     mid = (start+end)/2;

        //     if(key>arr[mid]){
        //         start = mid+1;
        //     }

        //     else if(key<arr[mid]){
        //         end = mid-1;
        //     }

        //     else if(arr[mid] == key){
        //           loc = mid;
        //           break;
        //     }
        // }

        // if(loc>=0){
        //    System.out.println("Element found at index:"+loc);
        // }

        // else{
        //     System.out.println("Element not found:");
        // }


        //Approach 2) Using array class methods;

        System.out.println(Arrays.binarySearch(arr,key));
    }
}
