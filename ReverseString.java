//  method 1 (Reversing a String using StrinBuilder method)

public class ReverseString {
    static void main() {
        String s = "This is my Home";
//        StringBuilder sb = new StringBuilder(s); // String ko stringBuilder m convert krdia
//        sb.reverse(); // Character ko ulta kr dia
//        System.out.println(sb);

        // Method 2 (using for loop)

        for (int i = s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }




    }
}
//Time Complexity: O(n)

