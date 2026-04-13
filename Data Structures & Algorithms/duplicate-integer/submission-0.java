class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(nums[i]==nums[j]){
                return true;
            }
        }
        return false;
    }
}