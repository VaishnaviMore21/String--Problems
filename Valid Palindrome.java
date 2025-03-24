class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;

            }
             // If characters are equal update the pointers
            else if (Character.toLowerCase(s.charAt(i)) 
                    == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
