public class bubbleSort {
    
    public static void main(String args[]){
        int arr[] = { 12,34,5,78,9,23};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
                else{
                    continue;
                }
            }
        }

        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
