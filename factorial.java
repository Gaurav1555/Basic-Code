import java.util.*;
public class factorial {
    public static int fac(int num){
        if(num<1){
            return 1;
        }
        else{
            return num*fac(num-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();

        //Method 1) Using recursion:
       System.out.println(fac(num));
       
       //Method 2) Using for loop:
       int fact=1;
       for(int i=num;i>=1;i--){
           fact = fact*i;
       }
       System.out.println(fact);
    }
}
