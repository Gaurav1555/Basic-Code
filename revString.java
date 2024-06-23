import java.util.*;
public class revString{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        String s = sc.nextLine();

        //Method 1): Using String buffer class:
        StringBuffer sbb = new StringBuffer(s);
        sbb.reverse();
        System.out.println(sbb);

        //Method 2): Using charAt() method:

        String revString ="";
        for(int i=0;i<s.length();i++){

            revString = s.charAt(i)+revString;
        }

        System.out.println(revString);


        //Method 3) Using charArray:

        String revStr="";
        char arr[] = s.toCharArray();

        for(int i=0;i<arr.length;i++){
    
            revStr = arr[i]+revStr;
        }
        System.out.println(revStr);
    }
}
