class Solution {
    public int maxArea(int[] heights) {
        
        if(heights.length == 0){
            return 0;
        }
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while(left < right){
            int length = Math.min(heights[left],heights[right]);
            int width = right - left;
            maxArea = Math.max(maxArea,length * width);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
    return maxArea;
    }
}
