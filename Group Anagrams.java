class Solution {

    // Method to create a frequency-based string from a word
    public String getfrequencyString(String str) {
        // Create an array to store frequency of each lowercase English letter
        int[] freq = new int[26];

        // Count frequency of each character in the input string
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Build a frequency string (e.g., for "eat" => "a1b0c0...e1...t1...")
        StringBuilder frequencyString = new StringBuilder("");
        char c = 'a';
        for (int i : freq) {
            frequencyString.append(c); // Append character
            frequencyString.append(i); // Append its count
            c++; // Move to next character
        }

        // Return the unique frequency string representation
        return frequencyString.toString();
    }

    // Main method to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        // If the input array is null or empty, return an empty list
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        // Map to hold frequency string as key and list of anagrams as value
        Map<String, List<String>> frequencyStringMap = new HashMap<>();

        // Iterate over each word in the input array
        for (String str : strs) {
            // Generate frequency string for the current word
            String frequencyString = getfrequencyString(str);

            // If this frequency string is already in the map, add to the existing list
            if (frequencyStringMap.containsKey(frequencyString)) {
                frequencyStringMap.get(frequencyString).add(str);
            } 
            // Otherwise, create a new list and add the current word
            else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                frequencyStringMap.put(frequencyString, strList);
            }
        }

        // Return all the values (i.e., grouped anagrams) as a list of lists
        return new ArrayList<>(frequencyStringMap.values());
    }
}
