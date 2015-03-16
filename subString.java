package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
import java.util.Scanner;
public class subString {
    public static String sString(String text, int start, int end){
        String result="";
        for (int i=start;i<end;i++){
            result+=text.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        String word;
        int start, end;
        System.out.println("What is the word you want to use?");
        word=cow.nextLine();
        System.out.println("Which character do you want to start at?");
        start=cow.nextInt();
        System.out.println("Which character do you want to end at?");
        end=cow.nextInt();
        System.out.println(sString(word,start,end));
    }
}

