import java.util.*;
public class reverseNum{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it:");
        int num = sc.nextInt();

        //Method 1) Using String Builder;
        StringBuilder sb = new StringBuilder();
        
        sb.append(num);
        sb.reverse();
        System.out.println(sb);

        //Method 2) Using String Buffer:

        StringBuffer sbf = new StringBuffer(String.valueOf(num));
        sbf.reverse();

        System.out.println(sbf);


        //Method 3) Using While loop:
        int rem , rev=0;
        
        while(num!=0){
            rem = num%10;

            rev = (rev*10)+rem;

            num = num/10;

        }

        System.out.println(rev);



      
    }
}
