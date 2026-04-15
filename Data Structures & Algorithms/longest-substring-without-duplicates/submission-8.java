class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(s == null || n == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int left = 0;
        int right = 0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < n){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            ans = Math.max(ans,right - left + 1);
            right++;
        }
        return ans;
    }
}
