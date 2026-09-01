class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
        mpp.put(nums[i],i);
        }
        for(int i = 0 ; i < nums.length;i++){
            int rem = target - nums[i];
            if(mpp.containsKey(rem) && mpp.get(rem)!=i){
                return new int[] {i,mpp.get(rem)};
            }
        }
         return new int[]{};
    }
}