class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();        
        for (int i = 0 ; i < nums.length ; i++){
            if (map.get(target - nums[i]) != null){
                return new int[]{map.get(target - nums[i]), i};
            }
            if (map.get(nums[i]) == null){
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}