import java.util.HashSet;
public class duplicate{
    public static void main(String args[]){
        String arr[] = {"C","Java","Python","JavaScript","Java"};

        //Approach 1): Using for loop:
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i].equals(arr[j])){
        //             System.out.println("Duplicate element found "+arr[j]+"at index "+j);
        //             System.exit(0);
        //         }
        //     }
        // }

        //System.out.println("No Duplicate element found:");

        //Approach 2) Using Hashset:

        HashSet <String> lang  = new HashSet<>();
        
        boolean flag = false;
        for(String l:arr){
           if(lang.add(l)==false){
            System.out.println("Found Duplicate Element: "+l);
            flag = true;
           }
        }

        if(flag == false){
            System.out.println("Not found Duplicates");
        }

    }
}