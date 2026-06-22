class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int right = 0;
        HashSet<Character> hs = new HashSet<>();
        int len = s.length();
        int ans = 0;
        while(right < len){
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
