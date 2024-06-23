public class swap {
    public static void main(String args[]){
        int a=10,b=20,temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("a ="+a+" "+"b ="+b);

        // Method: 1) With add and subtract ;

        a = a+b;
        b= a-b;
        a= a-b;

        System.out.println("a ="+a+" "+"b ="+b);

        // Method: 2) With multiply and division;

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("a ="+a+" "+"b ="+b);
        
        //Method: 3) Single statement:

        b= a+b-(a=b);


    }
}
