class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while(left < right){
          
            int width = Math.min(heights[left],heights[right]);
            int length = right - left;

            max = Math.max(max , length * width);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }


        }

        return max;


    }
}
