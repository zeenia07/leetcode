class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        
        int i=0;
        int j=1;
        int curr=0;
        int count=1;
        
        while(j<n){
            
            if(nums[i]!=nums[j]){
                curr++;
                nums[curr]=nums[j];
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}