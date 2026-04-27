class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return 1;
        }
        int left = 0;
        int right = 0;
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
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
