class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums.length == 0){
            return new int[]{};
        }
        int pre = 1, post = 1;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = pre;
            pre = pre * nums[i]; 
        }

        for(int i = nums.length - 1; i >= 0; i--){
            result[i] = result[i] * post;
            post = post * nums[i];
        }

        return result;

    }
}  
