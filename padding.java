package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
import java.util.Scanner;
public class padding {
    public static String padding(String word, int length){
        String pad="";
        for (int i=word.length();i<length; i++){
            pad+="-";
        }
        return pad;

    }
    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        System.out.println("Which word do you want to pad");
        String word=cow.nextLine();
        System.out.println("How long do you want your line to be?");
        int length=cow.nextInt();
        System.out.println("Do you want padding to right or left?");
        cow.nextLine();
        String answer=cow.nextLine();
        if(answer.equalsIgnoreCase("right")) {
            System.out.println(word + padding(word, length));
        }else if(answer.equalsIgnoreCase("left")){
            System.out.println(padding(word, length)+word);
        }else{
            System.out.println("Invalid input cow!");
        }
    }
}
