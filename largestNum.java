import java.util.Scanner;
public class largestNum {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three number:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Method 1): Using max method:

        int max = Math.max(a,Math.max(b,c));
        System.out.println(max);

        //Method 2): Using ternary operator:
        int m = a>b?a:b;
        System.out.println(m>c?m:c);
    }
}
