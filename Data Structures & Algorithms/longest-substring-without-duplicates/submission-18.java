class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int left = 0;
        int right = 0;
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        while(right < len){
            char ch = s.charAt(right);
            while(hs.contains(s.charAt(right))){
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
