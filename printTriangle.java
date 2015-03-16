package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/15/15.
 */
public class printTriangle {
    public static void pTriangle(String str){

        for(int i= 1;i<=str.length(); i++){
            System.out.println(str.substring(0,i));
       }
    }

    public static void main(String[]args){
       String str="fattyduck";
        pTriangle(str);
    }

}
