class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums){
            if (map.containsKey(i)){
                map.put(i, 2);
            }else map.put(i, 1);
        }
        
        for (Map.Entry<Integer, Integer> i : map.entrySet()){
            if (i.getValue() == 1)
                return i.getKey();
        }
        return 0;
    }
}