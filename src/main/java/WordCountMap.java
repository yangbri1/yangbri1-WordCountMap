
import java.util.HashMap;
import java.util.Map;

import java.util.Set;
import java.util.HashSet;

public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        // apply Java built-in String .split() method to split 'words' by whitespace " "
        String[] wordsAry = words.split(" ");

        // Set<String> wordsNoDupes = new HashSet<>();
        // String[] wordsAryNoDupes = wordsAry.

        // instantiate map using HashMap to keep count of each individual 'word' in given 'words'
        Map<String, Integer> wordsMap = new HashMap<>();
        // int i = 0;
        /* https://stackoverflow.com/questions/8098601/java-count-occurrence-of-each-item-in-an-array */
        // for-each loop to iterate via each own 'word' in String[] array
        for(String word : wordsAry){
            // if Map does NOT currently hold a key 'word'...
            if(!wordsMap.containsKey(word)){
                // place key-value element into Map w/ value of 1(occurence of word)
                wordsMap.put(word, 1);
            }
            // otw if key 'word' already in Map ...
            else{
                // insert key-value pair into existing index & .get() previous value + 1 to update count
                wordsMap.put(word, wordsMap.get(word) + 1);
            }
        }
        // return Map showing each word count
        return wordsMap;
    }
}
