class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int left = 0;
        int right = 0;
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            ans = Math.max(ans,right - left + 1);
            right++;
        }
        return ans;
    }
}
