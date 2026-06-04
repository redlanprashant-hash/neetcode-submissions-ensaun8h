class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int right = 0;
        int ans = 0;
        int[] occurnace = new int[26];
        int maxOccurance = 0;
        
        for(right = 0; right < s.length(); right++){
            maxOccurance = Math.max(maxOccurance, ++occurnace[s.charAt(right) - 'A']);

            if(right - left + 1 - maxOccurance > k){
                occurnace[s.charAt(left) - 'A']--;
                left++;
            }
        ans = Math.max(ans, right - left + 1);


        }
    return ans;

    }
}
