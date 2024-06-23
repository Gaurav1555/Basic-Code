public class Strings{
    public static void main(String args[]){
    //     StringBuilder sb = new StringBuilder("Gaurav Vishwakarma");
    //     System.out.println(sb);
    //    // sb.reverse();
    //     //System.out.println(sb);
    //     sb.append("Shamshabad");
    //     System.out.println(sb);
    //     sb.insert(7,"kumar");
    //     System.out.println(sb);
    //     sb.setCharAt(15,'t');
    //     System.out.println(sb);
    //     System.out.println(sb.length());
    //     sb.replace(0, 6, "Batman");
    //     System.out.println(sb);
    //     sb.delete(0,6);
    //     System.out.println(sb);
       
    //Reversing a String:
    StringBuilder sb = new StringBuilder("Gaurab");
    for(int i =0;i<sb.length()/2;i++){
        int front = i;
        int back = sb.length()-1-i;
        if(front == back){
            break;
        }
        char frontChar = sb.charAt(front);
        char backChar= sb.charAt(back);

        sb.setCharAt(front,backChar);
        sb.setCharAt(back, frontChar);

    }
    System.out.println(sb);

    }
}