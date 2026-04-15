class Solution {
    public int longestConsecutive(int[] nums) {

         
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        int longestSub = 1;
        for(int num : nums){
            numSet.add(num);
        }
        for(int num : nums){
            if(numSet.contains(num-1)){
                continue;
            }else{
                int currentSub = 1;
                int currentNum = num;
                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(longestSub,currentSub);
            }
       
        }
     return longestSub;



    }
}
