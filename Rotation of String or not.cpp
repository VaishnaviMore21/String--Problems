//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution
{
    public:
    //Function to check if two strings are rotations of each other or not.
    bool areRotations(string s1,string s2)
    {
        // Your code here
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2)return 0;
        else
        {
            string temp=s1+s1;
            if(temp.find(s2)!=string::npos)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        return 0;
    }
};

//{ Driver Code Starts.

