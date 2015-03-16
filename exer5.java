package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
import java.util.Scanner;
public class exer5 {
    public static void repeatString(String word, int length){
        String output="";

        for(int i=0 ; i<word.length();i++){
            output+=word.charAt(i);
                while(output.length()<length){
                    int j=0;
                    output+=word.charAt(j++);
                }
            }
            System.out.println(output);
        }



    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        System.out.println("What do you want to repeat, cow?");
        String werd=cow.nextLine();
        System.out.println("How long do you want your line to be, cow?");
        int length=cow.nextInt();
        repeatString(werd, length);
    }
}