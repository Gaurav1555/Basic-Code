import java.util.Scanner;
public class evenOdd{
    public static void main(String args[]){
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int evenCount=0, oddCount=0,rem;

        while(num!=0){
            rem = num%10;
            num= num/10;
            if(rem%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }

        System.out.println("No. of even count is: "+evenCount);
        System.out.println("No. of Odd count is: "+oddCount);
    }
}
