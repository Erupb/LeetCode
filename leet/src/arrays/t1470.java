package arrays;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> arr = new ArrayList();
        for(int i=0; i<n; i++){
            arr.add(nums[i]);
            arr.add(nums[n+i]);
        }
        int[] res = arr.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
