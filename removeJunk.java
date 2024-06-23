public class removeJunk {
    public static void main(String args[]){
        String s = "#$%$$**&%#(( #*$*%*@($()))) Gaurav 897778$%#$%$$#";

        s = s.replaceAll("[^a-zA-z0-9]","");

        System.out.println(s);

        String str = "Gaurav vishwakrama 8987777@#$%##$$ #$$#$";

        str = str.replaceAll("[^a-zA-z]"," ");
        System.out.println(str);

    }
}
