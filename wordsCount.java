import java.util.Scanner;

public class wordsCount {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = in.nextLine();
        int count = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("The number of words are:" + count);

    }
}