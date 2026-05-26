class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxOccurnace = 0;
        int occurance[] = new int[26];
        int ans = 0;
        for(right = 0; right < s.length(); right++){
            maxOccurnace = Math.max(maxOccurnace, ++occurance[s.charAt(right) - 'A']);
            if(right - left + 1 - maxOccurnace > k){
                occurance[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}
