class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> ansMap = new HashMap<>();
        int[] count = new int[26];
        for(String str : strs){
            Arrays.fill(count,0);
            for(char ch : str.toCharArray()){
              count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++){
                sb.append(count[i]);
                sb.append("#");
            }
            String key = sb.toString();

            if(!ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList());
            }
                ansMap.get(key).add(str);
          

            
        }

        return new ArrayList(ansMap.values());


    }
}
