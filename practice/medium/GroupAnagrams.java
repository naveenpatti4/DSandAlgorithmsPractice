package DSandAlgorithmsPractice.practice.medium;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
        for(String word : words){
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if(anagrams.containsKey(sortedWord)){
                anagrams.get(sortedWord).add(word);
            }else{
                anagrams.put(sortedWord, new ArrayList<>(Arrays.asList(word)));
            }

        }

        return new ArrayList<>(anagrams.values());
    }
}
