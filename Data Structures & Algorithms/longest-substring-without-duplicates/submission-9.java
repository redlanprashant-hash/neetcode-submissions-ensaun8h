class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(s == null || n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int left = 0, right = 0, ans = 0;
        HashSet<Character> hs = new HashSet<>();
        while(right < n){
            char ch = s.charAt(right);
            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
