class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer, Integer> check = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            Integer num=target-nums[i];
            if(check.containsKey(num)){
                result[0]=i;
                result[1]=check.get(num);
                return result;
            }
            check.put(nums[i], i);
        }
        return result;
    }
}