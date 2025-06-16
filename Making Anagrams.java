class Solution {
    public int minSteps(String s, String t) {
        
        // Frequency array to store count of each character in s and t
        int[] c = new int[26];

        // Convert both strings to lowercase to ensure case-insensitive comparison
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Count frequency of each character in the first string
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }

        // Subtract frequency of characters found in the second string
        for (int i = 0; i < t.length(); i++) {
            c[t.charAt(i) - 'a']--;
        }

        // Calculate the total steps required (sum of absolute differences)
        int total = 0;
        for (int i : c) {
            total += Math.abs(i); // Count characters that are different
        }

        return total;
    }
}
