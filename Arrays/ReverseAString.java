import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ReverseAString {

    //Naveen
    //neevaN

    public static void main(String[] args) {

       // reverse2("I am Naveen");
        reverseUsingStringBuilder("I am Naveen");
    }


    public static String reverse2(String str) {

        if (str == null || str.length() < 2) {
            return str;
        }

        String output = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }
        System.out.println(output);
        return output;
    }

    public static String reverseUsingStringBuilder(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder output = new StringBuilder(input).reverse();
        System.out.println(output.toString());
        return output.toString();
    }
}
