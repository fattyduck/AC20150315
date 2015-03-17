/**
 * Created by fattyduck on 3/16/15.
 */
public class allTogether {
    public static String reverse(String word){
        int numChar=word.length();
        String results="";
        for(int i=numChar-1;i>= 0; i--){
            results+=word.charAt(i);
        }
        return results;
    }

    public static int wordCount(String word, char choice){
        int wCount=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==(choice)){
                wCount+=1;
            }
        }
        return wCount;
    }

    public static String swap2(String word){
        String swapped="";
            for(int i=0;i<word.length();i+=2){
                swapped+=word.charAt(i);

            }
        return swapped;
    }
    public static String repeat(String word, int times){
        String re="";
            for(int i=0; i<times; i++){
                re+=word;
            }
        return re;
    }
    /*
    public static String repeat2(String word, int length){
        String re="";
           for(int i=0;i<length;i++){
               while(i<length){
                i-=word.length();
                re+=word.charAt(i);
               }
           }
        return re;
    }
    */
    public static String underline(String word, char symbol){
        String underline=word;
        underline+="\n";
        for (int i =0; i<word.length();i++){
            underline+=symbol;

        }
        return underline;
    }
    public static String box(String word){
        String boxa= "+";
        boxa+=repeat("-",word.length()+2);
        boxa+="+\n";
        String boxb="| ";
        boxb+=word;
        boxb+=" |\n";
        String box=boxa+boxb+boxa;

        return box ;
    }

    public static String substring(String word, int start, int end){
        String result="";
        for (int i=start; i<end; i++){
            result+=word.charAt(i);
        }
        return result;
    }

    public static void printTriangle(String word){

        for (int i=1;i>word.length();i++){
            System.out.println(substring(word, 0,i));
        }

    }



    public static void main(String[] args){
        //ystem.out.println(printTriangle("I am very handsome"));
        String word= "I am very handsome";
        printTriangle(word);
    }
}
