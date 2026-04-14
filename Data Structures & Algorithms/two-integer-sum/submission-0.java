class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Bruteforce

        int n=nums.length;
        /*for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];*/
        //Tc & Sc O(n)^2 O(1)

        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++){
            map1.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(map1.containsKey(diff)&&map1.get(diff)!=i){
                return new int[]{i,map1.get(diff)};
            }
        }
        return new int[0];
        //Tc & Sc O(n) O(n)
        

    }
}
