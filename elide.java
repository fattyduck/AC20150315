package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
public class elide {
    public static void elide(String str, int end){
        for(int i=0; i<end-3; i++){
            System.out.print(str.charAt(i));
        }
        System.out.print("...");
        System.out.println();
    }
    public static void main(String[] args){
     String ac = "Access code";
        System.out.println(ac.length());
        System.out.println(ac.replace('c','n'));
    }
}
