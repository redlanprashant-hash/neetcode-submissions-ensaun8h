class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0){
            return new int[]{};
        }
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        while(left < right){
           sum = numbers[left] + numbers[right];
           if(sum > target){
            right--;
           } else
           if(sum < target){
            left++;
           }else{
            return new int[]{left + 1, right + 1};
           }
        
        }
        return new int[]{};
 
    }
}
