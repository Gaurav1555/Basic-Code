import java.util.Scanner;
public class linearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input key:");
        int num = sc.nextInt();

        int arr[] = {12,13,55,667,45,2};

        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                System.out.println("key found at index:"+i);
                System.exit(0);
            }
        }
        System.out.println("Key not found:");
    }
}
