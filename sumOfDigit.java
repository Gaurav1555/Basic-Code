import java.util.Scanner;
public class sumOfDigit{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int rem, sum=0 , orgNum = num;

        while(num!=0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }

        System.out.println("The sum of digit of "+orgNum+" is "+sum);
    }
}