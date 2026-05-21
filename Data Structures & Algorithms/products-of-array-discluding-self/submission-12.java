class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums.length == 0){
            return new int[]{};
        }

    int prefix = 1, postfix = 1;
    int result[] = new int[nums.length];

    for(int i = 0; i < nums.length; i++){
        result[i] = prefix;
        prefix = prefix * nums[i];
    }

    for(int i = nums.length-1; i >= 0; i--){
        result[i] = postfix * result[i];
        postfix = postfix * nums[i];
    }

    return result;

    }
}  
