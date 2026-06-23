public class RotateString {

    public boolean rotateString(String s, String goal) {

        // Lengths must be equal
        if (s.length() != goal.length()) {
            return false;
        }

        // Check if goal is a substring of s + s
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {

        RotateString obj = new RotateString();

        String s = "abcde";
        String goal = "cdeab";

        boolean result = obj.rotateString(s, goal);

        System.out.println(result);
    }
}
