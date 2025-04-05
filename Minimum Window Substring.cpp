class Solution {
public:
    string minWindow(string s, string t) {
         if (t.length() == 0) return "";
  map < char, int > mpt;
  map < char, int > mps;
  for (int i = 0; i < t.length(); i++) {
    mpt[t[i]]++;
  }
  int cur = 0, total = mpt.size();
  int i = 0, j = 0;
  int res = INT_MAX;
  pair < int, int > indices;
  while (j < s.length()) {
    if (mpt.find(s[j]) != mpt.end()) mps[s[j]]++;
    if (mpt.find(s[j]) != mpt.end() && mps[s[j]] == mpt[s[j]]) cur++;

    while (cur == total) {
      //update result 
      if (j - i + 1 < res) {
        res = j - i + 1;

        indices = make_pair(i, j);
      }
      //shrink 
      if (mps.find(s[i]) != mps.end()) {
        mps[s[i]]--;
        if (mps.find(s[i]) != mps.end() && mps[s[i]] < mpt[s[i]]) cur--;
      }
      i++;
    }
    j++;
  }
  if (res == INT_MAX) return "";
  string str = "";
  for (int i = indices.first; i <= indices.second; i++) {
    str += s[i];
  }
  return str;
}
    
};
