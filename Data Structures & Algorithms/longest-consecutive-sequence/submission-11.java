class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int longestSub = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }

        for(int num : hs){
            if(hs.contains(num - 1)){
                continue;
            }else{
                int currentSub = 1;
                int currentNum = num;
                while(hs.contains(currentNum + 1)){
                    currentSub++;
                    currentNum++;
                }
                longestSub = Math.max(currentSub, longestSub);
            }
        }
        return longestSub;
        
    }
}
