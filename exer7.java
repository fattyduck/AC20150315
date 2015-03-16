package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
import java.util.Scanner;
public class exer7 {


    public static void dashes(String word){
        String dash="-";
        for (int i=0 ; i <word.length()-1;i++){
            dash+="-";
        }
        System.out.print(dash);


    }
    public static void top(String word){
        System.out.print("+");
        dashes(word);
        System.out.print("+");
        System.out.println();

    }

    public static void box(String word){
       top(word);
        System.out.print("|");
        System.out.print(word);
        System.out.print("|\n");
       top(word);



    }

    public static void main(String[] args) {
        Scanner cow = new Scanner(System.in);
        System.out.println("Tell me they word you want boxed");
        String word=cow.nextLine();
        box(word);

    }

}
