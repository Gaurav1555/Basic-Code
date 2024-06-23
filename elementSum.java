
public class elementSum {
    public static void main(String args[]){
        int arr[] = {12,14,34,23,23};

        int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum = sum+arr[i];
        // }

        for(int value:arr){
            sum = sum+value;
        }

        System.out.println(sum);
    }
}
