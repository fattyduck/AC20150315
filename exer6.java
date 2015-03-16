package nyc.c4q.fattyduck;
import java.util.Scanner;
/**
 * Created by fattyduck on 3/15/15.
 */
public class exer6 {
    public static void underlineEqual(String input) {
        for (int c = 0; c <= input.length(); c++) {
            System.out.print("=");
        }
    }
    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        System.out.println("Please enter word that you want to underline");
        String in=cow.nextLine();
        System.out.println("\n"+in);
        underlineEqual(in);
    }

}
