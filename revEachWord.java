import java.util.Arrays;
import java.util.Scanner;

// public class revEachWord {
//     public static void main(String args[]){

       
//         String str = "Hello World";

//         String revString = "";
//         String words[] = str.split(" ");

//         // for(int i=0; i<words.length;i++){
//         //     String revWord = "";

//         //     for(int j=words[i].length()-1;j>=0;j--){
//         //         revWord = revWord+words[i].charAt(j);
//         //     }
//         //     revString = revString+revWord+" ";
//         // }


//         //By using enhanced for loop:
//         for(String w:words){
//             String revWord = "";

//             for(int i=w.length()-1;i>=0;i--){
//                 revWord = revWord + w.charAt(i);
//             }

//             revString = revString + revWord+" ";
//         }
//        System.out.println("reversed string is : "+revString);
//     }
// }





//Approach 2)
public class revEachWord{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string:");
        String str = sc.nextLine();

        String words[] = str.split("\\s");

        String revString ="";

        for(String s: words){
            
                StringBuilder sb = new StringBuilder(s);
                sb.reverse();

                revString = revString+sb.toString()+" ";
        }

        System.out.println("The reversed string is: "+ revString);

    }
}
