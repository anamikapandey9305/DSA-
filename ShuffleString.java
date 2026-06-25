public class ShuffleString {

    // Method to shuffle the string according to indices array
    public static String restoreString(String s, int[] indices) {

        // Create a character array to store the shuffled string
        char[] result = new char[s.length()];

        // Traverse each character of the original string
        for (int i = 0; i < s.length(); i++) {

            // Place the current character at its new position
            result[indices[i]] = s.charAt(i);
        }

        // Convert character array back to String and return
        return new String(result);
    }

    public static void main(String[] args) {

        // Original string
        String s = "codeleet";

        // New positions for each character
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        // Call the method and store the result
        String shuffled = restoreString(s, indices);

        // Print the shuffled string
        System.out.println("Shuffled String: " + shuffled);
    }
}