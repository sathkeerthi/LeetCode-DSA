class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        int cur, prev;

        for (int i = 1 ; i <= rowIndex ; i++){
            prev = 1;
            for (int j = 1 ; j < list.size() ; j++){
                cur = list.get(j);
                list.set(j, cur+prev);
                prev = cur;
            }
            list.add(1);
        }

        return list;
    }
}