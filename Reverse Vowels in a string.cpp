class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
            } else if (!isVowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch); // Corrected this
    }

    public static boolean isVowel(char ch) {
        // Corrected to use character literals and return false
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
