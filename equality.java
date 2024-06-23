import java.util.*;
public class equality {
    public static void main(String args[]){
    
   int arr[] = {12,14,56,77,45};
   int arr1[] = { 12,14,56,77,45};

   //Method 1) Using equals method of Arrays class:
//    boolean status = Arrays.equals(arr,arr1);

//    if(status==true){
//     System.out.println("Arrays are equal:");
//    }
//    else{
//     System.out.println("Arrays are Not equal:");
//    }

   //Method 2) Brute force method:
   boolean status = true;

   if(arr.length==arr1.length){

    for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr1[i]){
            status = false;
            break;
        }
        else{
            continue;
        }
    }
}

    else{
        status = false;
    }

    if(status==false){
        System.out.println("Arrays are not equal:");
    }

    else{
        System.out.println("Arrays are equal:");
    }
}
}
