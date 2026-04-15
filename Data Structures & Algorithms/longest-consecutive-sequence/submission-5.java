class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
    HashSet<Integer> hs = new HashSet<>();
    int longestSub = 1;

    for(int num:nums){
     hs.add(num);
    }

    for(int num : nums){
        if(hs.contains(num-1)){
            continue;
        }else{
            int currentSub = 1;
            int currentNum = num;
            while(hs.contains(currentNum+1)){
                currentSub++;
                currentNum++;
            }
               longestSub = Math.max(longestSub,currentSub);
        }

     
    }

    return longestSub;
    }
}
