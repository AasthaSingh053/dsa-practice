//List[string] --> string = encode
//string --> list[string] = decode
import java.util.*;

class Solution {

    // Encode: escape ';' as "/;" and '/' as "//"
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ';') {
                    sb.append("/;");
                } else if (c == '/') {
                    sb.append("//");
                } else {
                    sb.append(c);
                }
            }
            sb.append(";"); // delimiter between strings
        }
        return sb.toString();
    }

    // Decode: reverse the escaping
    public List<String> decode(String s) {
        List<String> decodedStrings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '/') {
                // escaped character
                if (i + 1 < s.length()) {
                    sb.append(s.charAt(i + 1));
                }
                i += 2;
            } else if (s.charAt(i) != ';') {
                sb.append(s.charAt(i));
                i++;
            } else {
                // delimiter ';' → end of one string
                decodedStrings.add(sb.toString());
                sb.setLength(0);
                i++;
            }
        }

        // add last collected string if any
        if (sb.length() > 0) {
            decodedStrings.add(sb.toString());
            sb.setLength(0);
            i++;

        }

        return decodedStrings;
    }

    // MAIN METHOD for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        List<String> input = Arrays.asList("abc;def", "ghi/jkl", "mno");
        String encoded = sol.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = sol.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}