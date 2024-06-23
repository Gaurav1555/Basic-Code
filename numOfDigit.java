import java.util.*;
public class numOfDigit {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();
        
        //Method 1) Converting integer into string;
        String s = String.valueOf(num);
        System.out.println(s.length());

        //Method 2) Using while loop;
        int rem, count=0;
        int orgNum = num;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("No. of Digit in "+orgNum+" is "+count);
        
    }
}
