class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums.length == 0){
            return new int[]{};
        }
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
        int compliment = 0;
        for(int i = 0; i < nums.length; i++){
            compliment = target - nums[i];
            if(numMap.containsKey(compliment)){
                return new int[]{numMap.get(compliment),i};
            }
            numMap.put(nums[i],i);
        }

        return new int[]{};

    }
}
