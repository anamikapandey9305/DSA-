public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s

        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        if (isSubsequence(s, t)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}