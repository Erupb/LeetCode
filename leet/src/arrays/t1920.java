package arrays;

public class t1920 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; // memory O(n)

        for(int i=0; i<nums.length; i++){ // time O(n)
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
