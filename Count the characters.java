// User function Template for Java

class Sol {
    int getCount(String s, int N) {
        // your code here
        Map<Character,Integer>groupCount=new HashMap<>();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char current=s.charAt(i);
            if(i==0|| s.charAt(i)!=s.charAt(i-1))
            {
                  groupCount.put(current, groupCount.getOrDefault(current, 0) + 1);
            }
        }
           // Count characters with exactly N occurrences
        int result = 0;
        for (int count : groupCount.values()) {
            if (count == N) {
                result++;
            }
        }

        return result;
        
        
        
    }
}
