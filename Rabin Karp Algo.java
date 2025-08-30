import java.util.*;

class Solution {
    public ArrayList<Integer> rabinKarp(String text, String pattern) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();

        if (m > n) return result;

        int base = 256;          // number of possible characters
        int mod = 101;           // prime number to reduce collisions

        int patternHash = 0;     // hash value for pattern
        int windowHash = 0;      // hash value for current window of text
        int h = 1;

        // h = base^(m-1) % mod
        for (int i = 0; i < m - 1; i++) {
            h = (h * base) % mod;
        }

        // Calculate hash of pattern and first window of text
        for (int i = 0; i < m; i++) {
            patternHash = (base * patternHash + pattern.charAt(i)) % mod;
            windowHash = (base * windowHash + text.charAt(i)) % mod;
        }

        // Slide pattern over text
        for (int i = 0; i <= n - m; i++) {
            // If hash matches, check characters one by one
            if (patternHash == windowHash) {
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    result.add(i);  // 0-based index
                }
            }

            // Calculate hash for next window
            if (i < n - m) {
                windowHash = (base * (windowHash - text.charAt(i) * h) + text.charAt(i + m)) % mod;
                if (windowHash < 0) {
                    windowHash += mod;
                }
            }
        }

        return result;
    }
}
