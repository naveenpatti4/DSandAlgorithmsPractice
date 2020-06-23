import java.sql.Time;
import java.util.TimeZone;

public class LongestWord {


/*Longest Word
Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
 If there are two or more words that are the same length, return the first word from the string with that length.
 Ignore punctuation and assume sen will not be empty.*/

    public static String LongestWord(String sen) {
        sen = sen.replaceAll("[^a-zA-Z0-9\\s]", "");
        // System.out.print(sen);
        String[] strArry = sen.split(" ");
        // System.out.print(strArry.length);

        for (int i= 0; i < strArry.length; i++ ){
            for (int j = 1; j< strArry.length; j++){
                if (strArry[i].length() > strArry[j].length()){
                    System.out.println(strArry[i]);
                    return strArry[i];
                }else{
                    System.out.println(strArry[j]);
                    return strArry[j];
                }
            }
        }

        System.out.println();
        return sen;
    }

    public static String LongestWord2(String sen) {
        // code goes here
        //System.out.print(sen);
        sen = sen.replaceAll("[^a-zA-Z0-9\\s]", "");
        // System.out.print(sen);
        String[] strArry = sen.split(" ");
        // System.out.print(strArry.length);

        int ind = 0;

        for (int j = 1; j< strArry.length; j++){
            if (strArry[j].length() > strArry[ind].length()){
                ind = j;
            }
        }
        return strArry[ind];
    }

    public static void main (String[] args) {
       LongestWord("fun&!! time is over");
    }

}
