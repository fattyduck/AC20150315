package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
import java.util.Scanner;
public class exer4 {
    public static void repeatChar(String want, int num){
        for (int i=0;i <num;i++){
            System.out.print(want);
        }
    }
    public static void main(String[] args) {
        Scanner cow = new Scanner(System.in);

        System.out.println("Tell me the character you want");
        String cin = cow.nextLine();
        if (cin.length() > 1) {
            System.out.println("A Character, you cow!!!!!");
        } else
            System.out.println("How many times do you want it");
        int times = cow.nextInt();
        repeatChar(cin, times);
    }

}
