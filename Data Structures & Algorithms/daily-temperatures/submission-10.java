class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.add(i);
        }
    return ans;

    }
}
