public class countOccurence {
    public static void main(String args[]){

        String s = "Java is a programming language";

        int total_count = s.length();
        int count = s.replaceAll("a","").length();

        int occ = total_count-count;

        System.out.println(occ);

    }
}
