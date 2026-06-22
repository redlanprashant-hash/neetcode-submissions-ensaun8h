class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int right = 0;
        int maxOccurance = 0;
        int occurance[] = new int[26];
        int len = s.length();
        int ans = 0;
        while(right < len){
            maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right) - 'A']);
            if(right - left + 1 - maxOccurance > k){
                occurance[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
        


    }
}
