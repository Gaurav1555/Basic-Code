
import java.util.*;
public class maxMin {
    public static void main(String args[]){
        int arr[] = {12,1345,235,23,1};

        //Approach 1) Using Arrays.sort method:

        // Arrays.sort(arr);

        // int min = arr[0];
        // int max = arr[arr.length-1];
        // System.out.println("Minimum element is: "+min);
        // System.out.println("Maximum element is: "+max);

        //Approach 2) Using for loop:

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Minimum element is: "+ min);
        System.out.println("Maximum element is: "+max);
    }
}
