import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        // for(int i=0;i<n;i++){      BRUTE FORCE
        //     for(int j = 1;j<n;j++){
        //         if(nums[i]+nums[j]==target && i != j){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};


        // HASHMAP  BETTER SOL

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n ;i++){
            int a = nums[i];
            int more = target-a;
            if(map.containsKey(more)){
                return new int[]{map.get(more), i};

            }
            map.put(a, i);
        }
        return new int[]{-1, -1};
    }
}