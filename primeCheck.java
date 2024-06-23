import java.util.*;
public class primeCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();

        int count=0;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                count++;
            }
            else{
                continue;
            }
        }

        if(count>0){
            System.out.println("Not prime:");
        }
        else if(num==0||num==1){
            System.out.println("Not prime:");
        }
        else{
            System.out.println("Prime Number:");
        }
    }
}