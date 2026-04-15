class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums.length == 0){
            return new int[]{};
        }
        HashMap<Integer,Integer> ansMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(ansMap.containsKey(compliment)){
                return new int[]{ansMap.get(compliment),i};
            }
            ansMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
