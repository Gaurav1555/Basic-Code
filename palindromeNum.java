import java.util.*;
public class palindromeNum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();

        int rev =0, rem;
        int orgNum = num;

        while(num!=0){
            rem = num%10;

            num = num/10;

            rev =rev*10+rem;

        }

        if(rev==orgNum){
            System.out.println("It is a palindrome number");
        }

        else{
            System.out.println("Not a palindrome number");
        }


    }
}
