//Example: Linear Search :
/* 
import java.util.Scanner;
public class Search{
    public static void main(String args[]){
        int arr[] = {34,55,243,564,23,234};
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        for(c= 0;c<arr.length-1;c++){
            if(arr[c] == key){
                System.out.println("Key found at index:"+c);
                break;
            }

        }
        if(c == arr.length-1){
            System.out.println("Not found:");
        }
    }
}*/


//Example 2): Binary Search;

import java.util.Scanner;
public class Search{
    public static void main(String args[]){
        int arr[] = {12,13,44,65,76,89};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Key:");
        int key = sc.nextInt();
        int k = arr.length/2;
        if(arr[k]<key){
            k++;
        }

        }
    
}