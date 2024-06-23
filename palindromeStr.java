import java.util.Scanner;
public class palindromeStr {
     public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a string");

    String s = sc.nextLine();

    StringBuffer sb = new StringBuffer(s);

    sb.reverse();
    String rs = sb.toString();


    
    if(rs.equals(s)){
        System.out.println("It is a Palindrome String");
    }

    else{
        System.out.println("Not a palindrome String");
    }


    }
}
