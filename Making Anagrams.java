class Solution {
    public int minSteps(String s, String t) {
        
    int[] c = new int[26];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    for (int i = 0; i < s1.length(); i++) {
      c[s1.charAt(i) - 'a']++;
    }

    for (int i = 0; i < s2.length(); i++) {
      c[s2.charAt(i) - 'a']--;
    }

    int total = 0;
    for (int i : c) {
      total += Math.abs(i);
    }

    return total;
    }
}
