import java.util.Arrays;
import java.util.Collections;

public class sortMethods {
    public static void main(String args[]){
        int arr[] = {12,4,56,8,900,34,23};

        //Approach 1): Using sort method:

        // System.out.println("Before sorting: "+Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println("After sorting: "+Arrays.toString(arr));

        //Approach 2): Using parallel sort:
        // System.out.println("Before sorting:" + Arrays.toString(arr));
        // Arrays.parallelSort(arr);
        // System.out.println("After sorting:" + Arrays.toString(arr));

        //Sorting array in reverse order:

        Integer a[] = { 1,34,56,7,89,3,0,35};
        System.out.println("Before sorting:"+Arrays.toString(a));

        Arrays.sort(a,Collections.reverseOrder());        // This method not support array of primitive data type:

        System.out.println("After sorting:"+Arrays.toString(a));

    }
}
