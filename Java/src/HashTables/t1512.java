import java.util.HashMap;

class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int key = nums[i];
            if (numsMap.containsKey(key)) {
                int value = numsMap.get(key);
                numsMap.put(key, value + 1);
            } else {
                numsMap.put(key, 1);
            }
        }
        Integer res = 0;
        for(var entry : numsMap.entrySet()){
            if(entry.getValue()>1){
                res += entry.getValue()*(entry.getValue()-1) / 2;
            }
        }
        return res;
    }

    //Второе решение (более простое)
     /*
     public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        int res = 0;
        for(int num : nums){
            if (numsMap.containsKey(num)) {
                res += numsMap.get(num);
            } 
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }
       
     return res;
     }
     */
}