class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        unordered_map<int, int> mp;
        for (int i : nums) {
            mp[i]++;
        }
        int res = 0;
        for (auto p : mp) {
            if (p.second == 1)
                res += p.first;
        }
        return res;
    }
};