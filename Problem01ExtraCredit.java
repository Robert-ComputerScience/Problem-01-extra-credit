import java.util.*;

/*

Problem 01: An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 typically using all the original letters exactly once.
 Given an array of strings,
 you need to develop a function that sorts the anagrams and display them next to each other.


 */
public class Problem01ExtraCredit
{
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "hello", "world", "ate", "eat", "tea"};

        sortAnagrams(words);
    }

    public static void sortAnagrams(String[] words) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    /*
Time Complexity Analysis: Let n be the total number of words and m be the maximum length of a word.
 Constructing the HashMap takes O(n * mlogm) time due to sorting each word. Printing the grouped anagrams takes
 O(n)time. Therefore, the overall time complexity is O(n * mlogm).

 Space Complexity Analysis: The space complexity is O(n*m)
to store the words and their sorted versions in the HashMap.


     */

}
