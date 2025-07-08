
public class Solution {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
