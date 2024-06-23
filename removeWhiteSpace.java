public class removeWhiteSpace {
    public static void main(String args[]){
        String s = " java    c     python   ruby";

        s = s.replaceAll("\\s","");
        System.out.println(s);
    }
}
