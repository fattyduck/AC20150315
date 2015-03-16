package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
import java.util.Scanner;

public class exer2 {
    public static void printReverse(String input){

        for(int i=input.length()-1;i>=0;i--){
                    System.out.print(input.charAt(i));

        }


    }

    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        System.out.println("Enter the world you want reversed");
        String in=cow.nextLine();
        printReverse(in);
    }
}
