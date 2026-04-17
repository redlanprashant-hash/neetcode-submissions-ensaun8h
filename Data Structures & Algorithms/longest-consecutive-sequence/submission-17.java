class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
     int longestSub = 1;
     HashSet<Integer> hs = new HashSet<>();
     for(int num : nums){
        hs.add(num);
     }

        for(int num : hs){
            if(hs.contains(num-1)){
                continue;
            }else{
                int currentNum = num;
                int currentSub = 1;
                while(hs.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(longestSub,currentSub);
            }

        }
        return longestSub;
     
        
    }
}
