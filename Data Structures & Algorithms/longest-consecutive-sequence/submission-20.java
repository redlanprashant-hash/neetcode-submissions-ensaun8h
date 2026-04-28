class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longestSub = 1;
        HashSet<Integer> hs = new HashSet<>();

        if(nums.length == 0){
            return 0;
        }

        for(int num : nums){
            hs.add(num);
        }

        for(int num : hs){
            if(hs.contains(num-1)){
                continue;
            }else{
                int currentnum = num;
                int currentSub = 1;
                while(hs.contains(currentnum + 1)){
                    currentnum++;
                    currentSub++;
                }

                longestSub = Math.max(longestSub,currentSub);
            }
        }
        return longestSub;

    }
}
