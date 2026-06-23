// We define the usage of capitals in a word to be right when one of the following cases holds:
//
// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.
//

public class Detectcapital {

    public static boolean detectCapitalUse(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        if (count == word.length()) {
            return true;
        }

        if (count == 0) {
            return true;
        }

        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
       // String word = "GoGgle"; // it will return false
        String word = "Amazon"; // will return true

        boolean result = detectCapitalUse(word);

        System.out.println(result);
    }
}