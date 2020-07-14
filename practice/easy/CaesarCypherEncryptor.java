package DSandAlgorithmsPractice.practice.easy;

public class CaesarCypherEncryptor {

    public static void main(String[] args) {
        caesarCypherEncryptor("naveen", 2);
        caesarCypherDecryptor("pcxggp",2);
    }

    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : str.toCharArray()) {
            if (character != ' ') {
                System.out.println(character);
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }

    // works only str index + key < 26
    public static String caesarCypherDecryptor(String str, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : str.toCharArray()) {
            if (character != ' ') {
                System.out.println(character);
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = originalAlphabetPosition - (key % 26);
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
