import java.util.*;
public class randomNum {
    public static void main(String args[]){

        //Approach 1) Using random:
        Random r = new Random();
        int ranNum = r.nextInt(1000);
        System.out.println(ranNum);

        Random s = new Random();
        double no = s.nextDouble();
        System.out.println(no);

        //Approach 2) Using Math:
        System.out.println(Math.random());

    }
}
