class Solution {
    static String decodeString(String s) {
        // code here
         Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                    num = num * 10 + (ch - '0');
            }
            else if(ch=='[')
            {  countStack.push(num);
                stringStack.push(curr);
                // Reset for new block
                num = 0;
                curr = new StringBuilder();
                
            }
            else if(ch==']')
            {
                  int repeat = countStack.pop();
                StringBuilder decoded = stringStack.pop();
                for (int i = 0; i < repeat; i++) {
                    decoded.append(curr);
                }
                curr = decoded; // update current string
            }
            else
            {
                 curr.append(ch);
            }
        }
        return curr.toString();
    }
}
