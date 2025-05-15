class Solution 
{
    public String frequencySort(String s) 
     {
        Map<Character,Integer>map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>((a, b) -> (b.getValue() - a.getValue()));
        pq.addAll(map.entrySet());
        String ans= "";
        while(!pq.isEmpty())
        {
            Map.Entry<Character,Integer>head=pq.poll();
            int freq=head.getValue();
            while(freq-->0)
            {
                ans+=head.getKey();
            }
        }
        return ans;



    }
}
