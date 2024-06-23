import java.util.Scanner;
public class fibonacci {
    static public int fibo(int range){

        if(range==0||range==1){
            return range;
        }
        else{
            return fibo(range-1)+fibo(range-2);
        }
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        //Method 1: Using recursion:

        System.out.println(fibo(3));
        System.out.println("Enter the range of fibonacci series:");
        int range= sc.nextInt();

        //Method 2 : Using for loop:

        int a=1 ,b= 1;
        System.out.print(1+" , "+1+" ,");

        int c;
        for(int i=1;i<=range;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+" , ");
        }


    }
}
