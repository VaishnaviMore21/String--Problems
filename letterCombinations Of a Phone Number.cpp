class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if(digits.empty()) return {};
          vector<string> mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
         vector<string> result = {""};
     for(char digit:digits)
     {
        string letters = mapping[digit - '0'];
            vector<string> temp;
  for (string combination : result) {
                for (char letter : letters) {
                    temp.push_back(combination + letter);
                }
            }

            result = temp;
        }

        return result;
     }
    
};
